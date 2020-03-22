package com.fifthapp;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		MyThread1 mt1 = new MyThread1(a);
		mt1.setName("Ram thread");
		mt1.start();
		MyThread2 mt2 = new MyThread2(a);
		mt2.setName("Sita thread");
		mt2.start();
	}

}
