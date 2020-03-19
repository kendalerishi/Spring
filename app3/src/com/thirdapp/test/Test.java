package com.thirdapp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.thirdapp.bean.WelcomeBean;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Resource resource = new ClassPathResource("applicationCOntext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		WelcomeBean bean = (WelcomeBean)factory.getBean("welcomeBean");
		WelcomeBean bean1 = (WelcomeBean)factory.getBean("welcomeBean");
		WelcomeBean bean2 = (WelcomeBean)factory.getBean("welcomeBean");
		System.out.println(bean.wish());
		System.out.println(bean1.wish());
		System.out.println(bean2.wish());
		System.out.println(bean.count);
		System.out.println(bean1.count);
		System.out.println(bean2.count);
		
		
	}
}
