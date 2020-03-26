package com.app22.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app22.dao.AccountDao;

@Service("accService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao dao;
	
	@Override
	public String craeteAccount(String accNo, String accName, String accType, int balance) {
		
		return dao.craete(accNo, accName, accType, balance);
	}

	@Override
	public String searchAccount(String accNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateAccount(String accNo, String accName, String accType, int balance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAccount(String accNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
