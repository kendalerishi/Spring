package com.firstapp.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.firstapp.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloBean bean = (HelloBean)context.getBean("helloBean");
		String message = bean.sayHello();
		System.out.println(message);
		}
}
