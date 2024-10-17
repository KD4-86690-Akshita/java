import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
		
		int dosa = 30;
		int idli = 20;
		int samosa = 20;
		int noodles = 50;
		int Poha=20;
		int tea=10;
		int coffee=20;
		int vadapav=25;
		int masaladosa=30;
		int upma=20;
		int choice;
		int quantity;
		int totalbill = 0;
		
		
		do
		{
			System.out.println("Menu: ");
			System.out.println("Enter 0 to exit");
			System.out.println(" Enter 1 for Dosa Price: 30");
			System.out.println(" Enter 2 for Idli Price: 20");
			System.out.println(" Enter 3 for Samosa Price: 20");
			System.out.println(" Enter 4 for Noodles Price: 50");
			System.out.println(" Enter 5 for Poha Price: 20");
			System.out.println(" Enter 6 for tea Price: 10");
			System.out.println(" Enter 7 for coffee Price: 20");
			System.out.println(" Enter 8 for vada pav Price: 25");
			System.out.println(" Enter 9 for masala dosa Price: 30");
			System.out.println(" Enter 10 for upma Price: 20");
			System.out.println(" Enter 11 to Generate Bill");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			
			switch(choice)
			{
			case 1: 
				System.out.println("Enter quantity of dosa :");
			    quantity = sc.nextInt();
			    totalbill+=quantity*dosa;
			    break;
			case 2: 
				System.out.println("Enter quantity of Idli :");
				quantity = sc.nextInt();
				totalbill+=quantity*idli;
		        break;
			case 3: 
				System.out.println("Enter quantity of Samosa :");
				quantity = sc.nextInt();
				totalbill+=quantity*samosa;
                break;
			case 4: 
				System.out.println("Enter quantity of noodles :");
				quantity = sc.nextInt();
				totalbill+=quantity*noodles;		        
			    break;
			case 5:
				System.out.println("Enter quantity of poha :");
			    quantity = sc.nextInt();
			    totalbill+=quantity*Poha;
				break;
			case 6: 
				System.out.println("Enter quantity of tea :");
			    quantity = sc.nextInt();
			    totalbill+=quantity*tea;
			    break;
			case 7 :
				System.out.println("Enter quantity of coffee :");
			    quantity = sc.nextInt();
				totalbill+=quantity*coffee;
	            break;
			case 8: 
				System.out.println("Enter quantity of coffee :");
				quantity = sc.nextInt();
				totalbill+=quantity*vadapav;
                break;
			case 9: 
				System.out.println("Enter quantity of coffee :");
				quantity = sc.nextInt();
				totalbill+=quantity*masaladosa;
				break;
			case 10: 
				System.out.println("Enter quantity of coffee :");
				quantity = sc.nextInt();
				totalbill+=quantity*upma;
			    break;
			case 11:
				System.out.println("Total bill:RS" + totalbill);
				break;
			default:
				    System.out.println("invalid choice..........");
			
		}

		}while(choice!=0);
		System.out.println("Thankyou");
	}

	}


