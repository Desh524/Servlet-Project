package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static final String url = "jdbc:mysql://localhost:3306/school";
	private static final String username = "root";
	private static final String password = "";
	
	public static Connection getconnection() throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, username, password);
		}
		catch(ClassNotFoundException | SQLException e ) {
			throw new SQLException("error connecting to the database: " + e.getMessage());
		}
	}
	public static void closeConnection(Connection Connection) {
		if (Connection != null) {
			try {
				Connection.close();
			}catch(SQLException e) {
				System.out.println("Error closing Connection" + e.getMessage());
			}
		}
	}
}
