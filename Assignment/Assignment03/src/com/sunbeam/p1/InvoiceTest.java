package com.sunbeam.p1;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice i=new Invoice(null, null, 0, 0);
		i.accept();
		i.display();
		double num=i.calAmount();
		System.out.println("Total Amount :"+num);
//		i.setQuantity(-3);
//		int num1=i.getQuantity();
//		System.out.println("num1 :" + num1);
		

	}

}
