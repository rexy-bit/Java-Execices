package TP2;

import java.util.Scanner;
public class Exo1 {

	  public static void main(String[] args) {
		  
		  Scanner S = new Scanner(System.in);
		  
		  int cpt;
		  
		  System.out.print("Enter a number: \n");
		  cpt = S.nextInt();
		  
		  if(cpt%2 == 0) {
			  System.out.print("The number " + cpt + "is even");
		  }else {
			  System.out.print("The number " + cpt + "is odd");
		  }
		  
		  
	  }
}
