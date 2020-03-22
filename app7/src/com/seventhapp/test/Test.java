package com.seventhapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import com.seventhapp.beans.HelloBean;
import com.seventhapp.beans.WelcomeBean;
import com.seventhapp.config.BeanConfig;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//		HelloBean hellobean = (HelloBean)context.getBean("helloBean");
		HelloBean hellobean = (HelloBean)context.getBean("bean1");
		HelloBean hellobean1 = (HelloBean)context.getBean("bean1");
		WelcomeBean welcomebean = (WelcomeBean)context.getBean("welcomeBean");
		System.out.println(hellobean.sayHello());
		System.out.println(hellobean1.sayHello());
		System.out.println(hellobean1.count);
		System.out.println(welcomebean.sayWelcome());
		System.out.println(hellobean);
		System.out.println(hellobean1);
		
	}

}
