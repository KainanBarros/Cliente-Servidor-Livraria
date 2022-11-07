package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InserirLivro")
public class InserirLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int codlivro = Integer.parseInt(request.getParameter("codlivro"));
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		String categoria = request.getParameter("categoria");
		float valor = Float.parseFloat(request.getParameter("valor"));
		
		LivroModel novoLivro = new LivroModel();
		
		novoLivro.setCodlivro(codlivro);
		novoLivro.setTitulo(titulo);
		novoLivro.setAutor(autor);
		novoLivro.setCategoria(categoria);
		novoLivro.setValor(valor);
		
		LivroDao livroAdiciona = new LivroDao();
		
		livroAdiciona.postLivro(novoLivro);
		
		
	}

}
