package com.app.fruits;
import java.util.Scanner;

public class FruitBasket {
	public static int menu() {
		Scanner sc= new Scanner(System.in);
		System.out.println("");
		System.out.println("--------------------------------------------- ");
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display Names of all fruits in the basket");
		System.out.println("5. Display name,color,weight,taste of all fresh fruits , in the basket");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("7. Mark a fruit as stale ");
		System.out.println("8. Mark all sour fruits stale (optional) ");
		
		System.out.println("--------------------------------------------- ");
		System.out.println("Enter your choice: ");
		int choice=sc.nextInt();
		return choice;
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice;	
		System.out.print("Enter the basket size: ");
		int size=sc.nextInt();
		Fruit[] basket=new Fruit[size];
		int index=0;
		
		while((choice=menu())!=0) {
			switch(choice) {
				case 1:
				{
					if(index<size) {
					basket[index]=new Mango(); 
					basket[index].accept(sc);
					index++;
					}else {
					   System.out.println("basket is full");
					}				
					break;
				}
				case 2:
				{
					if(index<size) {
					basket[index]=new Orange(); 
					basket[index].accept(sc);
					index++;
					}else {
						System.out.println("basket is full");
					 }	
					break;
				}
				case 3:
				{
					if(index<size) {
					basket[index]=new Apple(); 
					basket[index].accept(sc);
					index++;
					}
					break;
				}
				case 4:
				{
					System.out.println("Names of fruits in basket are-");
					for(int i=0;i<index;i++) {
						System.out.println(basket[i].getName());
					}
					break;
				}
				case 5:
				{
					System.out.println("name,color,weight,taste of all fresh fruits, in the basket-");
					for(int i=0;i<index;i++) {
						if(basket[i].getIsFresh()) {
							System.out.println("Fruit name- "+basket[i].getName()+" ; "+basket[i].toString()+" ; "+"taste- "+basket[i].getTaste()+" ; "+"isFresh- "+basket[i].getIsFresh());
						}
					}
					break;
				}
				case 6:
				{
					System.out.println(" tastes of all stale(not fresh) fruits in the basket- ");
					for(int i=0;i<index;i++) {
						if(!basket[i].getIsFresh()) {
							System.out.println("Fruit name- "+basket[i].getName()+" ; "+"taste- "+basket[i].getTaste());
						}
					}
					break;
				}
				case 7:
				{
					System.out.println("Enter a index of fruit from basket which mark as stale- ");
					int input=sc.nextInt();
					if(input<index) {
					   for(int i=0;i<index;i++) {
						  basket[input].setFreshState(false);
					   }
			        }else {
			        	System.out.println("Entered index fruit not present in the basket..");
			        }
					break;
				}
				case 8:
				{
					   for(int i=0;i<index;i++) {
						  if(basket[i].getTaste()=="sour") {
							  basket[i].setFreshState(false);
						  }
					   }
					break;
				}
				default:
					System.out.println("Wrong choice..");
					break;
		    }
		}		
	}
}
