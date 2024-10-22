package com.app.fruits;

import java.util.Scanner;

abstract public class Fruit {
	
	String color;
	double weight;
	String name;
	boolean isFresh=true;
	
	public Fruit(String name) {
		this.name=name;
	}
	public boolean getIsFresh() {
		return isFresh;
	}
	public void setFreshState(boolean freshState) {
		this.isFresh=freshState;
	}

    public void accept(Scanner sc) {
    	System.out.print("Enter color of fruit-");
    	color=sc.next();
    	System.out.print("Enter weight of fruit-");
    	weight=sc.nextDouble();
    }

    abstract public String getName() ;
    abstract public String getTaste() ;

    @Override
	public String toString() {
    	return "color- "+color+" ; "+"weight- "+weight;
    	
    }

}
