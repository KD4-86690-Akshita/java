package com.sunbeam01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class namestudents implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2)
	{
		return o1.getName().compareTo(o2.getName());
	}	
}
class citystudents implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2)
	{
		return o1.getCity().compareTo(o2.getCity());
	}	
}
class markstudents implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2)
	{
		return Double.compare(o2.getMarks(),o1.getMarks());
	}	
}


public class program {
	public static int menu(Scanner sc)
	{
		System.out.println("0.Exit");
		System.out.println("1. Display All Students ");
		System.out.println("2. Display Students Sorted on Roll Number");
		System.out.println("3. Display Students Sorted on name");
		System.out.println("4. Display Students Sorted on City");
		System.out.println("5. Display Students Sorted on Mark in Desc");
		System.out.print("Enter your choice :");
		return sc.nextInt();
		
	}
	public static void display(Student[] st1) {
		for(Student std:st1)
			System.out.println(std);	
	}

	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	Comparator<Student> comparator;
	Student[] st1= new Student[5];
	st1[0]=new Student(3,"Akshita","Nanded",70);
	st1[1]=new Student(4,"Sneha","Bihar",80);
	st1[2]=new Student(2,"Supriya","Karad",90);
	st1[3]=new Student(1,"Kranti","Hyderabad",75);
	st1[4]=new Student(5,"Nikita","Bidar",65);
	int choice;
	while((choice=menu(sc))!=0)
	{
		switch(choice){
		case 1:
			display(st1);
			break;
		case 2:
			Arrays.sort(st1);
			display(st1);
			break;
		case 3:
			comparator=new namestudents();
			Arrays.sort(st1,comparator);
			display(st1);
			break;
		case 4:
			comparator=new citystudents();
			Arrays.sort(st1,comparator);
			display(st1);
			break;
		case 5:
			comparator=new markstudents();
			Arrays.sort(st1,comparator);
			display(st1);
			break;
		default:
			System.out.println("Please Enter correct choice.........!");
		}
	  }
	

	}

}


