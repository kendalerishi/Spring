package com.app15.beans;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class EmployeeService {
	
	private String driver_Class;
	private String driver_URL;
	private String dB_UserName;
	private String dB_Pass;
	Connection conn;
	Statement st;
		
	public String getDriver_Class() {
		return driver_Class;
	}

	public void setDriver_Class(String driver_Class) {
		this.driver_Class = driver_Class;
	}

	public String getDriver_URL() {
		return driver_URL;
	}

	public void setDriver_URL(String driver_URL) {
		this.driver_URL = driver_URL;
	}

	public String getdB_UserName() {
		return dB_UserName;
	}

	public void setdB_UserName(String dB_UserName) {
		this.dB_UserName = dB_UserName;
	}

	public String getdB_Pass() {
		return dB_Pass;
	}

	public void setdB_Pass(String dB_Pass) {
		this.dB_Pass = dB_Pass;
	}

	public void init() {
		try {
			Class.forName(driver_Class);
//			conn = DriverManager.getConnection("jdbc:mysql://localhost/rr","root","root");
			conn = DriverManager.getConnection(driver_URL,dB_UserName,dB_Pass);
//			conn = DriverManager.getConnection("jdbc:mysql://localhost/rr?" +"user=root&password=root");
			st = conn.createStatement();
			}	catch (Exception e){
			e.printStackTrace();
			}
	}
	
	public void getEmpDetails() {
		
		try {
			ResultSet rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("----------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("ENO")+"\t");     //System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString("ENAME")+"\t");    //System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getFloat("ESAL")+"\t");
				System.out.println(rs.getString("EADDR")+"\t");
			}
		}
		catch (Exception e){
			
			e.printStackTrace();
		}
	}
}
