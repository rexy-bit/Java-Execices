package TP2;

import java.util.Scanner;


public class Exo7 {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		
		int N,M;
		
		do {
			System.out.print("Enter N : \n");
			N = S.nextInt();
		}while(N <= 0);
		
		do {
			
			System.out.print("Enter M : ");
			M = S.nextInt();
			
		}while(M <= 0);
		
		int val1, val2;
		
		System.out.print("Enter val1 : ");
		val1 = S.nextInt();
		
		System.out.print("Enter val2 : ");
		val2 = S.nextInt();
		
		int[][] A = new int[N][M];
		
		for(int i = 0;i<N;i++) {
			for(int j = 0;j<M;j++) {
				if(i%2 == 0) {
					A[i][j]  = val1;
				}else {
					A[i][j] = val2;
				}
			}
		}
		
		System.out.print("The matrix: \n");
		for(int i = 0;i<N;i++) {
			for(int j = 0;j<M;j++) {
				System.out.print(A[i][j] + " |");
			}
			System.out.print("\n");
		}
	}
}
