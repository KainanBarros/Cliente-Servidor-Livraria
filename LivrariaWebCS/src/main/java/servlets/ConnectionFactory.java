package servlets;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
	public static void main(String[] args) {
		ConnectionFactory obj_DB_Connection = new ConnectionFactory();
		System.out.println(obj_DB_Connection.getConnection());
	}
	
	public Connection getConnection() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bdlivraria?useTimezone=true&serverTimezone=UTC",
					"root", "1974B@rros");
		}catch(Exception e){
			System.out.println(e);
		}
		return connection;
	}
}
