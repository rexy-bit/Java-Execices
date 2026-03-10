package TP2;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		char operator;
		
		Scanner S = new Scanner(System.in);
		
		System.out.print("Choose an operator : ");
		operator = S.next().charAt(0);
		
		int num1, num2;
		
		System.out.print("Enter num1 : ");
		num1 = S.nextInt();
		
		System.out.print("Enter num2 : ");
		num2 = S.nextInt();
		
		
		switch(operator) {
		
		case '+' : 
			System.out.print("The result is : " + (num1 + num2) + "\n");
			break;
			
		case '-' : 
			System.out.print("The result is : " + (num1 - num2) + "\n");
			break;
			
		case '*' : 
			System.out.print("The result is : " + (num1 * num2) + "\n");
			break;
			
		case '/' : 
			
			if(num2 == 0) {
				System.out.print("\nDivision impossible");
				break;
			}
			System.out.print("The result is : " + (num1 + num2) + "\n");
			break;
			
		default : 
			System.out.print("Wrong operator");
			break;
		}
		
	
		
		
	}
}
