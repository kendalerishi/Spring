package com.fifthapp;

public class ThreadScope extends ThreadLocal {
	
	@Override
	protected Object initialValue() {
		// TODO Auto-generated method stub
		return "default value";
	}
	
	

}
