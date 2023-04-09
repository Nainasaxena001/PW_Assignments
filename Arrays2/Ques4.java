package PW_ASSIGNMENTS.Arrays2;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n= sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter target sum:");
        int Target= sc.nextInt();
        System.out.println("Enter "+n+" elements:");
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i <n ; i++) { //for selecting first number.
            for (int j = i+1; j < n; j++) { //for selecting second number.
                if (arr[i]+arr[j]==Target){
                    System.out.println(i+" "+j);
                }
                break;
            }
        }


    }
}
