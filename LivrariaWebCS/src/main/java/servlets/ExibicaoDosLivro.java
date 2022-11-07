package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ExibicaoDosLivro")
public class ExibicaoDosLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cat = request.getParameter("tipoLivros");
		
		System.out.println("Passei aqui");
		
		System.out.println(cat);
		LivroDao livro = new LivroDao();		
		
		List<LivroModel> listaDeLivros = livro.getListaLivros(cat);
		
		request.setAttribute("listaDeLivros", listaDeLivros);
		
		getServletContext().getRequestDispatcher("/listaLivrosPorCategoria.jsp").forward(request, response);
		
		
	}

}
