package com.secondapp.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.secondapp.beans.HelloBean;

public class RunApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/secondapp/cfgs/applicationContext.xml");
		ApplicationContext context1 = new ClassPathXmlApplicationContext("/com/secondapp/cfgs/applicationContext.xml");
//		ApplicationContext context2 = new ClassPathXmlApplicationContext("/com/secondapp/cfgs/applicationContext.xml");
		
		HelloBean bean = (HelloBean)context.getBean("HelloBean");
		HelloBean bean1 = (HelloBean)context1.getBean("HelloBean");
		HelloBean bean2 = (HelloBean)context.getBean("HelloBean");
		System.out.println(bean.x);
		System.out.println(bean);
		System.out.println(bean1);
		System.out.println(bean2);
//		System.out.println(context);
//		System.out.println(context1);
//		System.out.println(context2);
//		bean.setName("Ram");
//		System.out.println(bean.sayHello());
	}

}
