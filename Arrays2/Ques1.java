package PW_ASSIGNMENTS.Arrays2;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of Array:");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter "+n+" elemets:");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int ans[]= new int[n];
        int idx=0;
        for (int i = 0; i <n ; i++) {
            if (arr[i]>=0){
                ans[idx]=arr[i];
                idx++;
            }
        }
        for (int i = 0; i <n ; i++) {
            if (arr[i]<=0){
                ans[idx]=arr[i];
                idx++;
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}