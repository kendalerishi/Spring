package com.app22.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app22.dao.AccountDao;
import com.app22.dto.Account;

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
		
		return dao.search(accNo);
	}

	@Override
	public String updateAccount(String accNo, String accName, String accType, int balance) {
		
		return dao.update(accNo, accName, accType, balance);
	}

	@Override
	public String deleteAccount(String accNo) {
		
		return dao.delete(accNo);
	}
	@Override
	public Account getAccount(String accNo) {
			
		return dao.getAccount(accNo);
	}
	
	

}
