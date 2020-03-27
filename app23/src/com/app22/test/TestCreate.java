package com.app22.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.app22.dao.AccountDaoImpl;
import com.app22.service.AccountService;

public class TestCreate {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService accSer = (AccountService)context.getBean("accService");
		String status= accSer.craeteAccount("424","Gita", "Current",5000);
//		System.out.println(dao.conn);
//		System.out.println(status);
		if(status.equals("Success"))
			System.out.println("Accunt created.");
		else if(status.equals("Existed"))
			System.out.println("Account already existed.");
		else
			System.out.println("Account not created.");
		}
}
