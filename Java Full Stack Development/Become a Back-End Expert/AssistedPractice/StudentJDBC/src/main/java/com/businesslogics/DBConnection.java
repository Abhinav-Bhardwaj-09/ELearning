package com.businesslogics;

import java.sql.*;

public class DBConnection {
	static Connection con = null;
	
	public static Connection getDBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// loading driver class in memory at run time
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details", "root", "Abhinav123");	// Creating connection object
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
