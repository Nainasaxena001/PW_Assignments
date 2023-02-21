package Conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter first value:");
        Scanner num= new Scanner(System.in);
        double first= num.nextDouble();
        System.out.println("Enter second value:");
        double second= num.nextDouble();
        System.out.println("Enter operator to be used:");
        char operator=num.next().charAt(0);
        double ans= 0;

        switch(operator){
            case '+':
                ans=first+second;
                System.out.println(first+"+"+second+"="+ans);
                break;
            case '-':
                ans=first-second;
                System.out.println(first+"-"+second+"="+ans);
                break;
            case '*':
                ans=first*second;
                System.out.println(first+"*"+second+"="+ans);
                break;
            case '/':
                ans=first/second;
                System.out.println(first+"/"+second+"="+ans);
                break;
            default:
                System.out.println("invalid");
        }

    }
}
