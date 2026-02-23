package Exo;
import java.util.Scanner;

public class Sum2 {
    
    public static void main(String args[]){

        int N;

        Scanner S = new Scanner(System.in);
        do{
            System.out.print("\nEnter a suze for the array : ");
            N = S.nextInt();
        }while(N <=0);

        int[] T = new int[N];
        System.out.print("\nRemplissage du tableau : ");
        for(int i = 0;i<N;i++){
            System.out.print("\nEnter tha value of the case : " + i);
            T[i] = S.nextInt();
        }

        System.out.print("The array : ");
        for(int i = 0;i<N;i++){
            System.out.print(T[i]);
        }

        int max = T[0];

        for(int i = 1;i<N;i++){
            if(T[i] > max){
                max = T[i];
            }
        }
        S.close();
    }
}
