package com.training.ifaces;

import java.util.Scanner;
import com.training.ifaces.ShowRoom;
import com.training.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ch ="Y";
        Scanner Y = new Scanner(System.in);
       
        
        
		do{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 1 for maruti 2 for toyota and 3 for bike");
		
		int key=sc.nextInt();
		
		
		ShowRoom obj = new NewShowRoom();
		
		Automobile polyAuto = obj.getModel(key);
		if(polyAuto==null)
		{
			System.out.println("invalid choice");
		}
		
		else
		{
			
		obj.printQuote(polyAuto);
		}
		
	
		System.out.println("Y to continue N to exit ");
		ch = sc.next();
		}
		while(ch.equalsIgnoreCase("Y"));
        
	}
}
