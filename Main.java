package tp1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MyPhone p = new MyPhone();
        Scanner S = new Scanner(System.in);

        System.out.print("Enter the brand : ");
        p.brand = S.nextLine();

        System.out.print("Enter the price : ");
        p.price = S.nextInt();

        System.out.print("Enter the storage : ");
        p.storage = S.nextInt();

        p.display();
    }
}