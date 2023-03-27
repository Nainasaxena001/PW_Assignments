package Java_Operators;

import java.util.Scanner;

public class Swap_Without3rd_Variable {
    public static void main(String[] args) {

        System.out.println("Enter the first value:");
        Scanner num= new Scanner(System.in);
        int x= num.nextInt();

        System.out.println("Enter the second value:");
        int y= num.nextInt();

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("First value after swapping="+x);
        System.out.println("Second value after swapping"+y);
    }
}
