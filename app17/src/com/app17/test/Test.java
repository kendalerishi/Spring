package com.app17.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app17.beans.Branch;
import com.app17.beans.Student;

public class Test {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student std = (Student)context.getBean("student");
		std.getStudentName();
		Branch brc = (Branch)context.getBean("branch");
		brc.getBranchName();
	}
}
