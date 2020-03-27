package com.app22.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app22.service.AccountService;

public class TestSearch {

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService accSer = (AccountService)context.getBean("accService");
		String status= accSer.searchAccount("421");
		System.out.println("Account Details : "+status);
	}

}
