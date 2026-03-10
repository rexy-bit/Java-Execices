package TP2;

import java.util.Scanner;
public class Exo2 {

	public static void main(String[] args) {
		
	   int mark;
	   
	   Scanner S = new Scanner(System.in);
	   
	   do {
		   System.out.print("Enter a mark");
		   mark = S.nextInt();
	   }while(mark < 0 || mark > 20);
	   
	   
	   if(mark >= 18) {
		   System.out.print("Excellent");
	   }else if(mark >= 14) {
		   System.out.print("Very Good");
	   }else if(mark >= 12) {
		   System.out.print("Good");
	   }else if(mark >= 10) {
		   System.out.print("Pass");
	   }else {
		   System.out.print("Fail");
	   }
	   
	}
}
