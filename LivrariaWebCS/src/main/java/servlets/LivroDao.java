package servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDao {

	
	private Connection connection;
	
	public LivroDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public List<LivroModel> getListaLivros(String cat){

		PreparedStatement stmt=null;
		ResultSet rs=null;
		List<LivroModel> livros = new ArrayList<LivroModel>();
		try {
			stmt = this.connection.prepareStatement("SELECT * FROM tblivros WHERE categoria = '" + cat + "';");
			rs = stmt.executeQuery();
			while(rs.next()) {
				LivroModel livro = new LivroModel();
		
				livro.setCodlivro(rs.getInt("codlivro"));
				livro.setTitulo(rs.getString("titulo"));
				livro.setAutor(rs.getString("autor"));
				livro.setCategoria(rs.getString("categoria"));
				livro.setValor(rs.getFloat("valor"));
		
				livros.add(livro);
		
			}
		
			rs.close();
			stmt.close();
		
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return livros;
	}
	
	public List<LivroModel> getLivro(String codLivro){

		PreparedStatement stmt=null;
		ResultSet rs=null;
		List<LivroModel> livros = new ArrayList<LivroModel>();
		try {
			stmt = this.connection.prepareStatement("SELECT * FROM tblivros WHERE codlivro = '" + codLivro + "';");
			rs = stmt.executeQuery();
			while(rs.next()) {
				LivroModel livro = new LivroModel();
		
				livro.setCodlivro(rs.getInt("codlivro"));
				livro.setTitulo(rs.getString("titulo"));
				livro.setAutor(rs.getString("autor"));
				livro.setCategoria(rs.getString("categoria"));
				livro.setValor(rs.getFloat("valor"));
		
				livros.add(livro);
		
			}
		
			rs.close();
			stmt.close();
		
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return livros;
	}
}
