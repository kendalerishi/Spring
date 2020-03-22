package com.fifthapp;

public class MyThread1 extends Thread {
	static ThreadScope scope = new ThreadScope();
	A a;
	MyThread1(A a){
		this.a = a;
	}
	@Override
	public void run() {
		scope.set("AAA");
		a.m1();
		}

}
