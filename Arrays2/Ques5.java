package PW_ASSIGNMENTS.Arrays2;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Arrays:");
        int n= sc.nextInt();
        int []  arr1= new int[n];
        int []  arr2= new int[n];
        System.out.println("Enter "+n+ " Elements of first Array:");
        for (int i = 0; i <n ; i++) {
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter "+n+ " Elements of second Array:");
        boolean ans= true;
        for (int i = 0; i <n ; i++) {
            arr2[i] = sc.nextInt();
            if (arr1[i]!=arr2[i]){
                ans=false;
                break;
            }
        }

        System.out.println(ans);
    }
}
