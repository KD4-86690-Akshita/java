package com.sunbeam1;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.next();
		StringBuilder sb=new StringBuilder(str);
		String rev=sb.reverse().toString();
		System.out.println(rev);
	}

}
