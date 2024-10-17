package com.sunbeam.p2;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee("Akshita","Redddy",10000);
		e1.display();
		double yearsal =e1.yearSalary();
		System.out.println("Yearly salary:"+yearsal);
		e1.incrementsal();
		System.out.println("-----------------------------------------------------------------------");
		
		Employee e2=new Employee();
		e2.accept();
		e2.display();
		double yearsal1 =e2.yearSalary();
		System.out.println("Yearly salary:"+yearsal1);
		e2.incrementsal();
		double sal=e2.getSalary();
		System.out.println("sal="+sal);

	}

}
