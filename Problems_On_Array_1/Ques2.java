package PW_ASSIGNMENTS.Problems_On_Array_1;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n= sc.nextInt();
        int[]arr= new int[n];
        System.out.println("Enter "+n+" elements:");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter target:");
        int x= sc.nextInt();
        int ans=0;
        for (int i = 0; i < n; i++) {
                if (arr[i]==x){
                    ans++;
                }
        }
        System.out.println("Number of Occ="+ans);
    }
}
