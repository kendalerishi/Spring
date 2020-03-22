package com.fifthapp;

public class MyThread2 extends Thread {
	static ThreadScope scope = new ThreadScope();
	A a;
	MyThread2(A a){
		this.a = a;
	}
	@Override
	public void run() {
		scope.set("BBB");
		a.m2();
		}

}
