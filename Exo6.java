package TP2;

import java.util.Scanner;
public class Exo6 {

	  public static void main(String[] args) {
		  
		  int N;
		  
		  Scanner S = new Scanner(System.in);
		  
		  do {
		  System.out.print("Enter the size of the array : ");
		  N = S.nextInt();
		  }while(N <= 0);
		  
		  int[] T = new int[N];
		  
		  for(int i = 0;i<N;i++) {
			  System.out.print("\nEnter the value; " + i + ": ");
			  T[i] = S.nextInt();
			  
		  }
		  
		  System.out.print("The array : \n");
		  for(int i = 0;i<N;i++) {
			  System.out.print(T[i] + " |");
		  }
		  
		  boolean find = false;
		  
		  int x;
		  
		  System.out.print("Enter a number to search : ");
		  x = S.nextInt();
		  
		  int i =0;
		  
		  while(i<N && !find) {
			  if(T[i] == x) {
				  find  = true;
				  
			  }else {
				  i++;
			  }
		  }
		  
		  
		  if(find) {
			  System.out.print("Found");
		  }else {
			  System.out.print("Not Found");
			  
		  }
		  
	  }
}
