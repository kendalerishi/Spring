package com.app22.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app22.service.AccountService;

public class TestDelete {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService accSer = (AccountService)context.getBean("accService");
		String status= accSer.deleteAccount("450");
		if(status.equals("Success"))
			System.out.println("Accunt successfully deleted.");
		else if(status.equals("Not Existed"))
			System.out.println("Account does not exists.");
		else if(status.equals("failure"))
			System.out.println("Account deletion failed.");

	}

}
