package PW_ASSIGNMENTS.Arrays2;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the first Array:");
        int n= sc.nextInt();
        System.out.println("Enter the length of the second Array:");
        int m= sc.nextInt();

        int []a= new int[n];
        int []b= new int[m];

        System.out.println("Enter "+n+" elements of first Array:");
        for (int i = 0; i <n ; i++) {
            a[i]= sc.nextInt();
        }
        System.out.println("Enter "+m+" elements of second Array:");
        for (int i = 0; i <m ; i++) {
            b[i]= sc.nextInt();
            boolean check = false;
            for(int j = 0; j < n; j++){
                if(b[i] == a[j]){
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.println(b[i]);
            }
        }
    }
}
