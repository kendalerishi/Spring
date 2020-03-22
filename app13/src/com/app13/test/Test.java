package com.app13.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app13.beans.Student;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student std = (Student)context.getBean("student");
		std.getStudentDetails();
		
	}

}
