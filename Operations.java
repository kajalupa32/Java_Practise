//Write a program that asks for two numbers and prints their sum, difference, product, and division
import java.util.Scanner;
public class Operations {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	
		System.out.println("Enter the first Number");
		double a=sc.nextDouble();
		System.out.println("Enter the first Number");
		double b=sc.nextDouble();
		
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(a%b);
	}

}
