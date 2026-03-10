package TP2;

import java.util.Scanner;
public class Exo3 {
	
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		int num1, num2;
		
		char operator;
		
		System.out.print("Enter an operator : ");
		operator = S.next().charAt(0);
		
		System.out.print("Enter num1 : ");
		num1 = S.nextInt();
		
		System.out.print("Enter num2 : ");
		num2 = S.nextInt();
		
		
		
		switch(operator) {
		case '+' : 
			System.out.print("The result is : " + (num1 + num2));
			break;
			
		case '-': 
			System.out.print("The result is : " + (num1 - num2));
			break;
			
		case '*' : 
			System.out.print("The result is : " + (num1 * num2));
			break;
			
		case '/' : 
			if(num2 == 0) {
				System.out.print("Division by 0 impossible");
			}else {
				System.out.print("The result is : " + (num1 / num2));
			}
			break;
		}
		
	}

}
