package com.app22.dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.app22.dto.Account;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

@Repository("accDao")
//@Component("accDao")
public class AccountDaoImpl implements AccountDao {

	
	@Autowired(required=true)
	private MysqlDataSource dataSource; 
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private String status="";
	
	@Override
	public String craete(String accNo, String accName, String accType, int balance) {
	    try {	
	    	
		conn = dataSource.getConnection();
		ps=conn.prepareStatement("Select * from account where accNo=?");
				ps.setString(1,accNo);
				rs = ps.executeQuery();
				boolean b = rs.next();
					if(b == true) {
						status = "existed";
					} else {				
		ps = conn.prepareStatement("insert into account values(?,?,?,?)");
				ps.setString(1,accNo);
				ps.setString(2,accName);
				ps.setString(3,accType);
				ps.setInt(4,balance);
				ps.executeUpdate();
				status="success";
					}
//		ps = conn.prepareStatement("delete from account");
//		ps.executeUpdate();
	    }
	    catch(Exception e) {
	    	status = "failure";
	    	e.printStackTrace();
	    }
		return status;
	}

	@Override
	public String search(String accNo) {
		
		try {
		
		conn = dataSource.getConnection();
		ps= conn.prepareStatement("select * from account where accNo=?");
		ps.setString(1,accNo);
		rs = ps.executeQuery();
		boolean b = rs.next();
			if(b==true) {
				status = "[Acc No: "+rs.getString(1)+", Acc name: "+rs.getString(2)+", Acc Type: "+rs.getString(3)+", Balance: "+rs.getInt(4)+"]";	
			} else{
				status="Account does not exists.";
			}
		}	
		catch(Exception e) {
			status = "Failure";
			e.printStackTrace();
		}
		
			return status;
	}

	@Override
	public String update(String accNo, String accName, String accType, int balance) {
		try {
			conn = dataSource.getConnection();
			ps=conn.prepareStatement("select * from account where accNo=?");
			ps.setString(1,accNo);
			rs=ps.executeQuery();
			boolean b = rs.next();
				if(b==true) {
			ps = conn.prepareStatement("update account set accName = ?, accType = ?, balance = ? where accNo = ?");
				ps.setString(1, accName);
				ps.setString(2, accType);
				ps.setInt(3, balance);
				ps.setString(4, accNo);
				ps.executeUpdate();
				status = "success";
				}else {
					status="Not Existed";
				}
			} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
			}
			return status;
	}

	@Override
	public String delete(String accNo) {
		try {
			conn = dataSource.getConnection();
			ps=conn.prepareStatement("select * from account where accNo=?");
			ps.setString(1,accNo);
			rs=ps.executeQuery();
			boolean b = rs.next();
				if(b==true) {
			ps = conn.prepareStatement("delete from account where accNo=?");
				ps.setString(1, accNo);
				ps.executeUpdate();
				status = "success";
				}else {
					status="Not Existed";
				}
			} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
			}
			return status;
	}
	
	@Override
	public Account getAccount(String accNo) {
		Account acc=null;
		try {
		
		conn = dataSource.getConnection();
		ps = conn.prepareStatement("select * from account where accNO = ?");
		ps.setString(1, accNo);
		rs = ps.executeQuery();
		boolean b = rs.next();
		if(b == true) {
		acc = new Account();
		acc.setAccNo(rs.getString("ACCNO"));
		acc.setAccName(rs.getString("ACCNAME"));
		acc.setAccType(rs.getString("ACCTYPE"));
		acc.setBalance(rs.getInt("BALANCE"));
		}else {
		acc = null;
		}
		} catch (Exception e) {
		e.printStackTrace();
		}
		return acc;
	}

}
