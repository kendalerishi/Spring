package com.app22.dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

@Repository("accDao")
//@Component("accDao")
public class AccountDaoImpl implements AccountDao {

	
	@Autowired(required=true)
	private MysqlDataSource dataSource; 
	public Connection conn;
	private String status="";
	
	@Override
	public String craete(String accNo, String accName, String accType, int balance) {
	    try {	
	    	
		conn = dataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("insert into account values(?,?,?,?)");
				ps.setString(1,accNo);
				ps.setString(2,accName);
				ps.setString(3,accType);
				ps.setInt(4,balance);
				ps.executeUpdate();
				status="Success";
//		ps = conn.prepareStatement("delete from account");
//		ps.executeUpdate();
	    }
	    catch(Exception e) {
	    	status = "Failure";
	    	e.printStackTrace();
	    }
		return status;
	}

	@Override
	public String search(String accNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(String accNo, String accName, String accType, int balance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String accNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
