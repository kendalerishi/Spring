package com.app22.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app22.dao.AccountDaoImpl;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDaoImpl dao = (AccountDaoImpl)context.getBean("accDao");
		String status = dao.craeteAccount("421", "Shyam", "Savings", 25000);
//		System.out.println(dao.conn);
//		System.out.println(status);
		if(status.contentEquals("Success"))
			System.out.println("Accunt created.");
		else
			System.out.println("Account not created.");

	}

}
