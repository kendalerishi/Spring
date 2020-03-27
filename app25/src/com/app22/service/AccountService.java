package com.app22.service;

import com.app22.dto.Account;

public interface AccountService {
	
	public String craeteAccount(String accNo, String accName, String accType, int balance);
	public String searchAccount(String accNo);
	public Account getAccount(String accNo);
	public String updateAccount(String accNo, String accName, String accType, int balance);	
	public String deleteAccount(String accNo);
	

}

