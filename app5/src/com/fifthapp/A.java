package com.fifthapp;

public class A {
	static ThreadScope scope = new ThreadScope();
	void m1() {
		System.out.println("m1() : "+Thread.currentThread().getName()+" Thread Local Value :"+scope.get());
	}
	
	void m2() {
		System.out.println("m2() : "+Thread.currentThread().getName()+" Thread Local Value :"+scope.get());
	}

}
