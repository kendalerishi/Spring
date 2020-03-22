package com.sixthapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sixthapp.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloBean bean = (HelloBean)context.getBean("helloBean");
//		HelloBean bean1 = (HelloBean)context.getBean("helloBean");
		System.out.println(bean);
//		System.out.println(bean1);
	}

}
