import java.util.Scanner;

public class Max2{
    
    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      int N1, N2;

      System.out.print("\nEnter N1 : ");
      N1 = sc.nextInt();

      System.out.print("\nEnter N2 : ");
      N2 = sc.nextInt();

      if(N1 > N2){
        System.out.print("\nThe max is : " + N1);

      }else if(N2 > N1){
        System.out.print("\nThe max is : " + N2);
      }else
      {
           System.out.print("\nThe numbers are equal");
      }


      sc.close();

    }
}
