package com.dbc;

import java.sql.DriverManager;  
import java.sql.SQLException;
import java.sql.Connection; 

public class TestDBC {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/rr";
	static final String DB_USER = "root";
	static final String DB_PASS = "root";
	
//	public static TestDBC objDBC = new TestDBC();
	
	public Connection getConnection() {
		Connection conn = null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
//		conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
		conn = DriverManager.getConnection("jdbc:mysql://localhost/rr?"+"user=root&password=root");
//		System.out.println(conn);
//		conn = DriverManager.getConnection("jdbc:mysql://localhost/rr?"+"user=root&password=root");
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	catch(ClassNotFoundException ce) {
		ce.printStackTrace();
	}
	return conn;
}
}