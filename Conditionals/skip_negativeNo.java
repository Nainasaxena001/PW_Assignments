package Conditionals;

import java.util.Scanner;

public class skip_negativeNo {
    public static void main(String[] args) {
        System.out.println("Enter any value: ");
        Scanner num= new Scanner(System.in);
        int value= num.nextInt();

        if (value>=0){
            System.out.println("You entered a positive value");
        }
        else {
            System.out.println("You entered a negative value");
        }
    }
}
