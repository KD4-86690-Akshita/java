package com.app.geometry;

import java.util.Scanner;

public class Point2D {
int x;
int y;

public Point2D(int x, int y) {
	this.x = x;
	this.y = y;
}
public String getDetails()
{
	return "("+x+","+y+")";
}
public boolean isEqual(Point2D p2)
{
  if(this.x==p2.x && this.y==p2.y)
  {
	  return true;
  }
  else
	  return false;
	  
}

public double calculateDistance(Point2D p2)
{
	return Math.sqrt(Math.pow((this.x-p2.x), 2) + Math.pow((this.y-p2.y),2));
}

public void accept()
{
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the value of X co-ordinate:");
	this.x=sc.nextInt();
	System.out.println("Enter the value of Y co-ordinate:");
	this.y=sc.nextInt();	
}

}
