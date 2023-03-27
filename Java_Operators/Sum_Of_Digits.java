package Java_Operators;

import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        System.out.println("Enter any digit:");
        Scanner sc=new Scanner(System.in);

        int num= sc.nextInt();
        int SumOfDigits=0;

        while(num>0){

            SumOfDigits +=num%10;
            num=num/10;
        }
        System.out.println("The sum of digits="+SumOfDigits);
    }
}
