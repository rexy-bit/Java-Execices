import java.util.Scanner;

public class Max{

    public static void main(String[] args){

         Scanner sc = new Scanner(System.in);

         int N1, N2;
         System.out.print("\nEntrez le premier nombre : ");
         N1 = sc.nextInt();

         System.out.print(sc);

         System.out.print("\nEntrez le deuxieme nombre : ");
         N2 = sc.nextInt();

         if(N1 > N2){
            System.out.print("The max is : " + N1);
         }else if(N1 < N2){
            System.out.print("The max is : " + N2);
         }else{
             System.out.print("The numbers are equal");
         }

         sc.close();
        }   

}