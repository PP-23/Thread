package com.training;

public class UsingThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// NEW THREAD
		Thread t1 = new MyThread("Ramesh");
		
		Thread t2 = new MyThread("Rajesh");
		
		Thread t3 = new MyThread("Rakesh");
		
		//MAKING IT RUNNABLE
		
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.run();
		t1.run();
		t1.run();
		
	}

}
