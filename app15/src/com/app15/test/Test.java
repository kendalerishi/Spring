package com.app15.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app15.beans.EmployeeService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService empService = (EmployeeService)context.getBean("employeeService");
		empService.getEmpDetails();
	}
}