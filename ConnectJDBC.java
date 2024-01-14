package View;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectJDBC {
	public static Connection getConnection() {
		Connection conn = null;              
		try{ 
			   String userName = "root";
			   String password = "199205";
			   
			   String url = "jdbc:mysql://localhost:3307/employeemanagement";
			   Class.forName("com.mysql.cj.jdbc.Driver");                   // đăng kí lớp JDBC driver trong mysql
			   conn = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConnection(Connection c) {
		try {
			if (c != null)
				c.close();
			System.out.println("Ngắt kết nối");
		} catch (Exception e) {
			e.printStackTrace();	
		}
		
	}
	
	public static void main(String[] args) {
		ConnectJDBC.getConnection();
	}
}