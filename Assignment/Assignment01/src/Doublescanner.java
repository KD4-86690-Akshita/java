import java.util.Scanner;

public class Doublescanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 =0,num2=0;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the value:");
		if(sc.hasNextDouble() && sc.hasNextInt()) {
			System.out.println("Enter double value only");
		}
		else
		{
			num1=sc.nextDouble();
			
		}
		
		if(sc.hasNextDouble() && sc.hasNextInt()) {
			System.out.println("Enter double value only");
		}
		else
		{
		    num2=sc.nextDouble();
			
		}
		
		double average=(num1+num2)/2;
		System.out.println("Average:"+average);


	}

}
