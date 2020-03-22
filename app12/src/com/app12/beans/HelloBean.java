package com.app12.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean, DisposableBean{
	
	private String name;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		System.out.println("setName(---)");
		this.name = name;
	}
	
	static {
		System.out.println("Bean class loading");
	}
	
	public HelloBean() {
		System.out.println("HelloBean instantiation");
	}

	public void customInit() {
		System.out.println("Custom Init");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		
	}
	@PostConstruct
	public void init() {
		System.out.println("init() - @PostConstructor");
	}

	public String sayHello(){
		return "Hello" + name;
	}
	
	public void customDestroy() {
		System.out.println("custom destroy()");
	}
	@Override
	public void destroy() {
		System.out.println("destroy() - DisposableBean");
	}
	
	@PreDestroy
	public void preDestroyDestroy() {
		System.out.println("preDestroyDestroy()");
	}
}
