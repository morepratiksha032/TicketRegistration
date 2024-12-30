package com.advanto.Implemented;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.adanto.Configuration.Connection;
import com.advanto.Entity.Buses;
import com.advanto.Entity.RegisteredUsers;
import com.advanto.Entity.User;
import com.advanto.UnImplemented.TRPInterface;

public class TRPClass implements TRPInterface {

	Scanner sc = new Scanner(System.in);
	
	SessionFactory sf = Connection.connect();
	
	@Override
	public void login() {
		
		System.out.println("Enter Name");
		String n = sc.next();
		
		System.out.println("Enter Contact No");
		long c = sc.nextLong();
		
		System.out.println("Enter Email");
		String e = sc.next();
		
		System.out.println("Enter Password");
		String p = sc.next();
		
		User u = new User();
		u.setId(1);
		u.setName(n);
		u.setConNo(c);
		u.setEmail(e);
		u.setPassword(p);
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(u);
		
		tx.commit();
		session.clear();
	}

	@Override
	public void showBuses() {
		
		Session session = sf.openSession();
		
		Criteria c1 = session.createCriteria(Buses.class);
		List<Buses> list = c1.list();
		
		for (Buses buses : list) {
			System.out.println(buses); 
		}
		
		System.out.println("Are you want to reserve ticket : true / false");
		boolean option = sc.nextBoolean();
		
		if(option) {
			bookBus();
		}else {
			System.out.println("Thank you for your co-operation");
		}
		
		session.clear();
		
	}
	
	public void bookBus() {
		
		System.out.println("Enter Your bus choice");
		int choice = sc.nextInt();
		
		System.out.println("Enter Your Adhar No");
		int a = sc.nextInt();
		
		System.out.println("Enter Your Name");
		String n = sc.next();
		
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		
		System.out.println("Enter Boarding Point");
		String b = sc.next();
		
		System.out.println("Enter Destination Point");
		String d = sc.next();
		
		System.out.println("Enter Year");
		int y = sc.nextInt();
		
		y = y-1900;
		
		System.out.println("Enter Month");
		int m = sc.nextInt();
		
		System.out.println("Enter Date");
		int date = sc.nextInt();
		
		System.out.println("Payment Status : true / false");
		boolean status = sc.nextBoolean();
		
		Date date1 = new Date(y, m, date);
		
		if(status) {

			RegisteredUsers ru = new RegisteredUsers(a, n, age, b, d, date1, status);
			
			Session session = sf.openSession();
			
			Transaction tx = session.beginTransaction();
			
			System.out.println("Adhar Number : " + ru.getAdharNo());
			System.out.println("Name : " + ru.getName());
			System.out.println("Age : " + ru.getAge());
			System.out.println("Boarding Point : " + ru.getBoardingPoint());
			System.out.println("Destination Point : " + ru.getDestinationPoint());
			System.out.println("Date of Departure : " + ru.getDateOfDeparture());
			
			session.save(ru);
			
			tx.commit();
			session.clear();
			
		} else {
			System.out.println("Please Make a Payment First to confirm Your Ticket");
		}
	}

	@Override
	public void cancel() {

		System.out.println("Enter Your Adhar No");
		int a = sc.nextInt();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		RegisteredUsers user = session.get(RegisteredUsers.class, a);
		
		session.delete(user);
		
		tx.commit();
		session.clear();
		
	}

	@Override
	public void updateInfo() {

		System.out.println("Enter Your Adhar No For Updation");
		int adhar = sc.nextInt();
		
		Session session = sf.openSession();
		
		RegisteredUsers user = session.get(RegisteredUsers.class, adhar);
		
		boolean ch = true;
		
		while(ch) {
			
			System.out.println("Select the Option to Update Your Data");
			System.out.println("1.Name");
			System.out.println("2.Age");
			System.out.println("3.Boarding Point");
			System.out.println("4.Destination Point");
			System.out.println("5.Date");
			System.out.println("6.Exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 :
			
				Transaction tx = session.beginTransaction();
				
				System.out.println("Enter Your Name");
				String n = sc.next();
				
				user.setName(n);
				
				session.save(user);
				
				tx.commit();
				
				break;
				
			case 2 :
				
				Transaction tx1 = session.beginTransaction();
				
				System.out.println("Enter Your Age");
				int age = sc.nextInt();
				
				user.setAge(age);
				
				session.save(user);
				
				tx1.commit();
				
				break;
				
			case 3 :
				
				Transaction tx2 = session.beginTransaction();
				
				System.out.println("Enter Boarding Point");
				String b = sc.next();
				
				user.setBoardingPoint(b);
				
				session.save(user);
				
				tx2.commit();
				
				break;
				
			case 4 :
				
				Transaction tx3 = session.beginTransaction();
				
				System.out.println("Enter Destination Point");
				String d = sc.next();
				
				user.setDestinationPoint(d);
				
				session.save(user);
				
				tx3.commit();
			
				break;
				
			case 5 :
				
				Transaction tx4 = session.beginTransaction();
				
				System.out.println("Enter Year");
				int y = sc.nextInt();
				
				System.out.println("Enter Month");
				int m = sc.nextInt();
				
				System.out.println("Enter Date");
				int dt = sc.nextInt();
				
				Date date = new Date(y, m, dt);
				
				user.setDateOfDeparture(date);
				
				session.save(user);
				
				tx4.commit();
				
				break;
				
			case 6 :
				System.out.println("Updated Successfully");
				ch = false;
			}
			
		}
		
	}
	
	public void insertBuses() {
		
		Buses b1 = new Buses(1, "Shivai", "MH 09 1722", "seater");
		Buses b2 = new Buses(1, "Shishahi", "MH 17 1723", "seater/sleeper");
		Buses b3 = new Buses(1, "Shivneri", "MH 29 7635", "sleeper");
		Buses b4 = new Buses(1, "Hirkani", "MH 12 8765", "seater/sleeper");

		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(b1);
		session.save(b2);
		session.save(b3);
		session.save(b4);
		
		tx.commit();
		session.clear();
		sf.close();
	}

}
