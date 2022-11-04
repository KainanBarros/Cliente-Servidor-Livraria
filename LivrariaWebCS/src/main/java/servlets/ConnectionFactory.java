package servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bdlivraria?useTimezone=true&serverTimezone=UTC",
					"root", "1974B@rros");
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}
