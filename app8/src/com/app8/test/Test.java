package com.app8.test;

// Bean class instantiation thru constructor

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app8.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloBean bean = (HelloBean)context.getBean("helloBean");
	}
}
