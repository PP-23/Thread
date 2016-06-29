package com.training;

public class UsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Runnable runnable = new SecondThred();
		
		Thread thread1 =new Thread(runnable,"Suresh");
		Thread thread2 =new Thread(runnable,"Muresh");
		Thread thread3 =new Thread(runnable,"Huresh");
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	}

}
