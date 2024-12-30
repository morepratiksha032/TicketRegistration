package com.hibernate.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class RegisteredUsers {

	
	@Id
	int adharNo;
	String name;
	int age;
	String boardingPoint;
	String destinationPoint;
	
	@Temporal(value = TemporalType.DATE)
	Date dateOfDeparture;
	boolean payment;
	public RegisteredUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisteredUsers(int adharNo, String name, int age, String boardingPoint, String destinationPoint,
			Date dateOfDeparture, boolean payment) {
		super();
		this.adharNo = adharNo;
		this.name = name;
		this.age = age;
		this.boardingPoint = boardingPoint;
		this.destinationPoint = destinationPoint;
		this.dateOfDeparture = dateOfDeparture;
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "RegisteredUsers [adharNo=" + adharNo + ", name=" + name + ", age=" + age + ", boardingPoint="
				+ boardingPoint + ", gdestinationPoint=" + destinationPoint + ", dateOfDeparture=" + dateOfDeparture
				+ ", payment=" + payment + "]";
	}
	public int getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBoardingPoint() {
		return boardingPoint;
	}
	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}
	public String getDestinationPoint() {
		return destinationPoint;
	}
	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public boolean isPayment() {
		return payment;
	}
	public void setPayment(boolean payment) {
		this.payment = payment;
	}
}
