package Java_Operators;

import java.util.Scanner;

public class Use_Of_Arithmetic_Operators {
    public static void main(String[] args) {
        System.out.println("Enter any value:");
        Scanner val= new Scanner(System.in);
        int x = val.nextInt();
        System.out.println((((x+8)/3)%5)*5);

    }
}
