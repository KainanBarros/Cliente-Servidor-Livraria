package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TrazendoUmLivro")
public class TrazendoUmLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cat = request.getParameter("codLivro");
		
		System.out.println("Passei aqui");
		
		System.out.println(cat);
		LivroDao livro = new LivroDao();		
		
		List<LivroModel> livroBD = livro.getLivro(cat);
		
		request.setAttribute("livroBD", livroBD);
		
		getServletContext().getRequestDispatcher("/mostrarLivros.jsp").forward(request, response);
	}

}
