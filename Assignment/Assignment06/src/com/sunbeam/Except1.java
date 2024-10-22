package com.sunbeam;

import java.util.Scanner;

public class Except1 {
	
	public static void accept() throws ExceptionLineTooLong {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String stat= sc.nextLine();
		if(stat.length()>80)
		{
			throw new ExceptionLineTooLong("The string is too long...");
		}
		else
		{
		 System.out.println("string is :"+stat);	
		}
		
	}
	
	public static void main(String[] args) {
		try {
			accept();
		}catch(ExceptionLineTooLong e) {
			e.printStackTrace();
		}
	}

}
