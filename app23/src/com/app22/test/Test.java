package com.app22.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.app22.dao.AccountDaoImpl;
import com.app22.service.AccountService;

@Controller("accController")
public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService accSer = (AccountService)context.getBean("accService");
		String status= accSer.craeteAccount("422","Shyam", "Current",50000);
//		System.out.println(dao.conn);
//		System.out.println(status);
		if(status.contentEquals("Success"))
			System.out.println("Accunt created.");
		else
			System.out.println("Account not created.");

	}

}
