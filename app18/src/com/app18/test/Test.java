package com.app18.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app18.beans.Branch;
import com.app18.beans.Student;


public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student std = (Student)context.getBean("studentBean");
		System.out.println(std.getStudentName());
		Branch brc = (Branch)context.getBean("branchBean");
		System.out.println(brc.getBranchName());
	}
}
