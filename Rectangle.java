package Tp1;

import java.util.Scanner;

public class Rectangle {
    
    int length;
    int width;

    Scanner S = new Scanner(System.in);


    public void area(){

        System.out.println("Enter the length : ");
        length = S.nextInt();

        System.out.println("Enter the width : ");
        width = S.nextInt();
        System.out.println("The area is : " + (length*width));

    }

    public void perimeter(){

        System.out.println("Enter the length : ");
        length = S.nextInt();

        System.out.println("Enter the width : ");
        width = S.nextInt();
        System.out.println("The perimeter is : " + ((length + width)*2));
    }
}
