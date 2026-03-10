package TP2;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int x;
		
		Scanner S = new Scanner(System.in);
		
		System.out.print("Enter a number : \n");
		x = S.nextInt();
		
		if(x%2 == 0) {
			System.out.print("The number " + x + "is even");
		}else {
			System.out.print("The number " + x + "is odd");
		}
	}
}
