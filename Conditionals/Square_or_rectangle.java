package Conditionals;

import java.util.Scanner;

public class Square_or_rectangle {
    public static void main(String[] args) {
        System.out.println("Enter the first value:");
        Scanner num=new Scanner(System.in);
        int length= num.nextInt();

        System.out.println("Enter the second value:");
        int breadth= num.nextInt();

        if(length == breadth){
            System.out.println("It is a Square");
        }
        else{
            System.out.println("It is a rectangle");
        }
    }
}
