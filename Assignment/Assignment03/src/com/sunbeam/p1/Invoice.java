package com.sunbeam.p1;

import java.util.Scanner;

public class Invoice {
	private String number;
	private String description;
	private int quantity;
	private double price;
	public Invoice(String number, String description, int quantity, double price) {
		super();
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity<0)
		{
			this.quantity=0;
		}
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<0)
		{
			this.price=0;
		}
			this.price = price;	
	}

	public void accept()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number :");
		number=sc.next();
		System.out.println("Enter the Description :");
		description=sc.next();
		System.out.println("Enter the Quantity :");
		quantity=sc.nextInt();
		if(quantity<0) {
			setQuantity(quantity);
		}
		System.out.println("Enter the price :");	
		price=sc.nextDouble();
		if(price<0)
			setPrice(price);
		
	}
	public double calAmount()
	{
		return quantity*price;
	}
	public void display()
	{
		System.out.println("Part Number :"+number);
		System.out.println("description :"+description);
		System.out.println("Quantity :"+quantity);
		System.out.println("Number :"+price);		
	}

	
	
	

}
