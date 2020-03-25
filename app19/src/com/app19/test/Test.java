package com.app19.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app19.beans.Employee;
import com.app19.beans.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee)context.getBean("employeeBean");
		emp.getEmpDetails();
		
		Student std = (Student)context.getBean("studentBean");
		std.getStudentDetails();
	}
}
