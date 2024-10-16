import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num1=sc.nextInt();
		System.out.println("given number :"+num1);
		System.out.println("Binary equivalent :"+Integer.toBinaryString(num1));
		System.out.println("Octal equivalent :"+Integer.toOctalString(num1));
		System.out.println("Hexadecimal equivalent :"+Integer.toHexString(num1));
		

	}
}
