package Conditionals;

import java.util.Scanner;

public class Grade_Marks {
    public static void main(String[] args) {
        System.out.println("Enter your marks");
        Scanner num=new Scanner(System.in);
        int Marks= num.nextInt();

        if (Marks>=90){
            System.out.println("A+");
        } else if (Marks>=80) {
            System.out.println("A");
        } else if (Marks>=70) {
            System.out.println("B+");
        } else if (Marks>=60) {
            System.out.println("B");
        } else if (Marks>=50) {
            System.out.println("C");
        } else if (Marks>=40) {
            System.out.println("D");
        } else if (Marks>=30) {
            System.out.println("E");
        }
        else{
            System.out.println("F");
        }

    }
}
