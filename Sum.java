
import java.util.Scanner;
public class Sum {
    
    public static void main(String args[]){

        int N;

        Scanner S  = new Scanner(System.in);
        do{
        System.out.print("Enter the size of the array : ");
        N = S.nextInt();
        }while(N <0);

        int[] T = new int[N];  
        System.out.print("\nRemplissage du tableau : ");
        for(int i = 0; i<N;i++){
            System.out.println("Enter the element : "+ i);
            T[i] = S.nextInt();
        }

        System.out.print("\nLe tableau\n");

        for(int i = 0;i<N;i++){
            System.out.print("\n");
            System.out.print(T[i]);
        }

        int cpt = 0;
        for(int i = 0;i<N;i++){
            cpt += T[i];
        }

        System.out.print("\n\nThe sum : " + cpt);

        S.close();

    }
}
