package com.sixthapp.customScope;

import java.util.HashMap;

public class MyThreadLocal extends ThreadLocal {
	
	@Override
	protected Object initialValue() {
	 
		return new HashMap<String,Object>();
	}

}
