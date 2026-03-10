package TP2;

public class Exo5 {

	public static void main(String[] args) {
		
		int S = 0;
		
		for(int i = 1; i<= 100;i++) {
			S += i;
		}
		
		System.out.print("The sum is : " + S + "\n");
		
		S = 0;
		int i= 1;
		
		while(i<= 100) {
			S += i;
			i++;
		}
		
		System.out.print("The sum is : " + S);
		
		
		
	}
}
