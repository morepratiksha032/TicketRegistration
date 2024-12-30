package com.hibernate;

import java.util.Scanner;

import com.hibernate.Implemented.TRPClass;

public class App {
   
	public static void main( String[] args )  {
        
		TRPClass t = new TRPClass();
		
//		t.insertBuses();
		
		Scanner sc = new Scanner(System.in);
		
		boolean ch = true;
		
		while(ch) {
			
			System.out.println("Select One of the below");
			System.out.println("1.Register New User");
			System.out.println("2.Search Buses");
			System.out.println("3.Cancel Your Ticket");
			System.out.println("4.Update Info from the ticket");
			System.out.println("5.Exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 :
				t.login();
				break;
				
			case 2 :
				t.showBuses();
				break;
				
			case 3 :
				t.cancel();
				break;
				
			case 4 :
				t.updateInfo();
				break;
				
			case 5 :
				System.out.println("Thank You For Participation");
				ch = false;
				break;
				
			case 6 :
				System.out.println("Out Of choice");
			}
		}

    }
}
