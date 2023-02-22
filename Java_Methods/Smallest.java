package Java_Methods;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a= sc.nextInt();

        System.out.println("Enter the second number:");
        int b= sc.nextInt();

        System.out.println("Enter the third number:");
        int c= sc.nextInt();
        System.out.println(Number(a,b,c));
    }

    public static int Number(int x, int y, int z) {
        int ans=0;
        if(x<y && x<z){
            System.out.print("The smallest number is=");
            ans=x;
        }
        else if (y<x && y<z) {
            System.out.print("The smallest number is=");
            ans=y;
        }
        else {
            System.out.print("The smallest number is=");
            ans=z;
        }
        return ans;
    }
}
