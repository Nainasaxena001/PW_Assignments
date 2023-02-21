package Conditionals;

import java.util.Scanner;

public class Absolute_value {
    public static void main(String[] args) {
        System.out.println("Enter any value:");
        Scanner num=new Scanner(System.in);
        int value= num.nextInt();

        if(value<0){
            value=value*-1;
        }
        System.out.println("The absolute value is="+value);
    }
}
