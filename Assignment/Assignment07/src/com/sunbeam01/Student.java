package com.sunbeam01;

public class Student implements Comparable<Student>{
	
	private int rollno;
	private String name;
	private String city;
	private double marks;
	
	public Student(int rollno, String name, String city, double marks) {
		this.rollno = rollno;
		this.setName(name);
		this.setCity(city);
		this.setMarks(marks);
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + getName() + ", city=" + getCity() + ", marks=" + getMarks() + "]";
	}

	public int compareTo(Student o) {
		return this.rollno-o.rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
}
