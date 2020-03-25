package com.app20.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app20.beans.Employee;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee)context.getBean("empBean");
		emp.getEmpDetails();
		
	}

}
