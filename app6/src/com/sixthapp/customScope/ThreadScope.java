package com.sixthapp.customScope;

import java.util.HashMap;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class ThreadScope implements Scope {

	MyThreadLocal threadLocal = new MyThreadLocal();
	HashMap<String, Object> hashmapscope = null; 
	
	@Override
	public Object get(String name, ObjectFactory<?> objectFactory	) {
	hashmapscope = (HashMap<String, Object>)threadLocal.get();
//	System.out.println(hashmapscope.get(name));
	Object obj = hashmapscope.get(name);    // this methods returns object for 
	if(obj==null) {
		obj = objectFactory.getObject();
		hashmapscope.put(name, obj);
	}
		return obj;
	}

	@Override
	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerDestructionCallback(String arg0, Runnable arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object remove(String name) {
		Object obj = hashmapscope.remove(name);
		return obj;
	}

	@Override
	public Object resolveContextualObject(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
