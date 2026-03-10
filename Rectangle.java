package TP1;

import java.util.Scanner;

public class Rectangle {

	int length;
	int width;
	
	Scanner S = new Scanner(System.in);
	
	public void area() {
		
		System.out.print("Enter the length : \n");
		length = S.nextInt();
		
		System.out.print("Enter the width : ");
		width = S.nextInt();
		
		System.out.println("The are is : " + (length*width));
		
	}
	
	public void perimeter() {
		
		System.out.println("Enter the length : \n");
		length = S.nextInt();
		
		System.out.println("Enter the width : \n");
		width = S.nextInt();
		
		System.out.println("The Perimeter is : " + ((length + width)*2));
		
	}
	
	
}
