package com.sunbeam.p2;

import java.util.Scanner;

public class Employee {
	private String FirstName;
	private String LastName;
	private double Salary;
    
	public Employee() {
		
	}

	public Employee(String firstName, String lastName, double Salary) {
		
		this.FirstName = firstName;
		this.LastName = lastName;
		if(Salary < 0)
		this.Salary = Salary;
		
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double Salary) {
		if(Salary < 0) {
		 this.Salary=0;
		}
		else {
			this.Salary=Salary;
		}
	}
	
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name :");
		FirstName=sc.next();
		System.out.println("Enter the last name :");
	    LastName=sc.next();
		System.out.println("Enter one month Salary :");
		Salary=sc.nextDouble();	
	setSalary(Salary);
//		if(Salary < 0)
//			setSalary(Salary);
	}
	public void display()
	{
		System.out.println("First Name :" +FirstName);
		System.out.println("Last Name :" + LastName);
		System.out.println("Salary :" +Salary);
	}

	public void incrementsal()
	{
		double incresal=yearSalary() *1.10;
		System.out.println("After increment:"+incresal);
	}
	public double yearSalary() {
		return Salary * 12;
		
	}

}
