package com.app21.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app21.beans.Student;

public class Test {
	
	private static ApplicationContext context;


	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student std = (Student)context.getBean("studentBean");
		std.getStudentDetails();
		
		
		

	}

}
