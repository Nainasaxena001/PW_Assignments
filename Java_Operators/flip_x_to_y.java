package Java_Operators;

import java.util.Scanner;

public class flip_x_to_y {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        int count=0;
        int n=a^b;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
    }

}
