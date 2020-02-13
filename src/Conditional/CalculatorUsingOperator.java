package Conditional;

import java.util.Scanner;

public class CalculatorUsingOperator {

	public static void main(String[] args) {
		System.out.println("Please choose a number: \n");
		System.out.println("Press 1 to add: ");
		System.out.println("Press 2 to subtract: ");
		System.out.println("Press 3 to multiply: ");
		System.out.println("Press 4 to divide");
		System.out.println("Press any other to Exit: ");
		Scanner sc=new Scanner(System.in);
		int Choice=sc.nextInt();
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		switch (Choice){
		case 1:
			System.out.println("The sum of two number is:"+(a+b));
			break;
		case 2:
			System.out.println("The subtraction of two number is:"+(a-b));
			break;
		case 3:
			System.out.println("The multiplication of two number is:"+(a*b));
			break;
		case 4:
			System.out.println("The division of two number is:"+((float)a/b));
			break;
		default:
			System.out.println("invlaid input:0");
			break;
			
			
		}
		
	

	}

}
