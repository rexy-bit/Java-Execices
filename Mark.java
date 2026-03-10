package TP2;

import java.util.Scanner;

public class Mark {

	public static void main(String[] args) {
		
		int note;
		
		Scanner S = new Scanner(System.in);
		
		do {
		System.out.print("Enter a mark : \n");
		note = S.nextInt();
		}while(note < 0 || note > 20);
		
		if(note >= 18) {
			System.out.print("Excellent");
		}else if(note >= 14) {
			System.out.print("Very Good");
		}else if(note >= 12) {
			System.out.print("Good");
		}else if(note >= 10) {
			System.out.print("Pass");
		}else {
			System.out.print("Fail");
		}
		
	}


}
