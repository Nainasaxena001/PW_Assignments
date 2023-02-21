package Java_Variables_and_DataTypes ;

import java.util.Scanner;

public class product_taking_input {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a= input.nextInt();
        System.out.println("Enter the second number:");
        int b= input.nextInt();

        System.out.println("The product of two numbers="+(a*b));

    }

}
