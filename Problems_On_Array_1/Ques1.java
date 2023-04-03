package PW_ASSIGNMENTS.Problems_On_Array_1;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n= sc.nextInt();
        int[]arr= new int[n];
        System.out.println("Enter "+n+" elements:");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter Targeted absolute difference is to be found:");
        int x= sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[j]-arr[i]==x){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
