package Java_Methods;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any year:");
        int year= sc.nextInt();
        System.out.println(Entered_year(year));
    }

    public static int Entered_year(int y) {
        if ((y%4==0) && (y%100!=0 || y%400==0) ){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        return y;
    }
}
