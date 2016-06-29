package com.training;

public class SecondThred implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		
		for(int i =0;i<=10;i++)
		{
			System.out.println("Current Thread :="+Thread.currentThread().getName());
		    
	}

}
}
