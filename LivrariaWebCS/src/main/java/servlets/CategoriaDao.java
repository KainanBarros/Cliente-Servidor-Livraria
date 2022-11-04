package servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDao {
	
	private Connection connection;
	
	public CategoriaDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	
	public List<CategoriaModel> getListaCategorias(){
		
		try {
			List<CategoriaModel> categorias = new ArrayList<CategoriaModel>();
			
			PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM tbcategorias");
			ResultSet rs = stmt.executeQuery();
			/*Começando o laço */
			while(rs.next()) {
			CategoriaModel categoria = new CategoriaModel();
			
			categoria.setCategoria(rs.getString("categoria"));
			categorias.add(categoria);
			
			}
			/*Terminando o laço*/
			rs.close();
			stmt.close();
			return categorias;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
