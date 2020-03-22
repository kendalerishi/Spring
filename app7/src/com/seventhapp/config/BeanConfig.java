package com.seventhapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.seventhapp.beans.HelloBean;
import com.seventhapp.beans.WelcomeBean;

@Configuration
public class BeanConfig {
	@Bean(name={"bean1","bean2"})
	@Scope("prototype")	
	public HelloBean helloBean() {
		
		return new HelloBean();
	}
	
	@Bean
	public WelcomeBean welcomeBean() {
		return new WelcomeBean();
	}

}
