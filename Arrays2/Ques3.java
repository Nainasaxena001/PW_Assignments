package PW_ASSIGNMENTS.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n= sc.nextInt();
        int[]arr= new int[n];
        System.out.println("Enter "+n+ " elements:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value of K:");
        int k= sc.nextInt();

        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
