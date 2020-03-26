package com.dbc;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.register.RegisterData;

public class DBController {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/test";
	static final String DB_USER = "root";
	static final String DB_PASS = "root";
	
//	private DBController() {}
	public static DBController objDBC = new DBController();
//	private static DBController objDBC = null;
//	public static DBController getObj() {
//		
//		if(objDBC==null)
//			objDBC = new DBController();
//		
//		return objDBC;
//	}
	
	public Connection getConnection() {
		
		Connection objConnection = null;
		try 
		{
		Class.forName("com.mysql.jdbc.Driver");
		objConnection = DriverManager.getConnection("jdbc:mysql://localhost/test?"+"user=root&password=root");
		}
		catch(ClassNotFoundException cnfe) 
		{
			cnfe.printStackTrace();
		}
		catch(SQLException se) 
		{
			se.printStackTrace();
		}
		return objConnection;
	}
	
	public void freeResources(Statement st, ResultSet rs) {
		
		try
		  {
			if(st!=null)
				st.close();
			if(rs!=null)
				rs.close();
		  }
		catch(SQLException se)
		  {
			se.printStackTrace();
	      }
	}
	
	public void user_Registration_Data(RegisterData regData) {
		
		Statement st = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try
		{
			System.out.println("Hi");
//			st = DBController.getObj().getConnection().createStatement();
			String sql = "insert into User values (?,?,?,?,?)";
//			pst = DBController.getObj().getConnection().prepareStatement(sql);
			if(objDBC.getConnection()!=null)
				System.out.println("Connected");
			if(objDBC.getConnection()==null)
				System.out.println("Never Connected");

//			pst = objDBC.getConnection().prepareStatement(sql);
//			pst.setString(1,regData.getUserName());
//			pst.setString(2,regData.getPassword());
//			pst.setString(3,regData.getMobile());
//			pst.setString(4,regData.getEmail());
//			pst.setString(5,regData.getDob());
		} 
//		catch(SQLException se)
//		{
//			se.printStackTrace();
//		}
		catch(Exception se)
		{
			se.printStackTrace();
		}
		finally
		{
			try
			{
				freeResources(st, rs);
				if(pst!=null)
					pst.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		}
	}	
}
