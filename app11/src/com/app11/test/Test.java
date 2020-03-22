package com.app11.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app11.beans.HelloBean;
import com.app11.beans.WelcomeBean;
import com.app11.beans.WishBean;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		WishBean wishBean = (WishBean)context.getBean("wishBean");
		HelloBean helloBean = (HelloBean)context.getBean("helloBean");
		WelcomeBean welcomeBean = (WelcomeBean)context.getBean("welcomeBean");
		
//		System.out.println(wishBean.sayWish());
		System.out.println(helloBean.sayHello());
		System.out.println(welcomeBean.sayWelcome());
		
		context.registerShutdownHook();
		
		
		
		
	}

}
