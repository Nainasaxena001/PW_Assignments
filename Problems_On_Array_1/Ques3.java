package PW_ASSIGNMENTS.Problems_On_Array_1;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ans=0;
        System.out.println("Enter size of Array:");
        int n= sc.nextInt();
        int[]arr= new int[n];
        System.out.println("Enter first "+(n-1)+" natural elements of Array:");
        for (int i = 0; i < n-1; i++) {
            arr[i]=sc.nextInt();
        }
        int SumWithoutMissingNo=0;
        for (int i = 0; i <n ; i++) {
            SumWithoutMissingNo+= arr[i];
        }

        int SumOfAllNos=0;
        for (int i = 1; i <=n ; i++) {
            SumOfAllNos+=i;
        }
        System.out.println("Missing No. is="+(SumOfAllNos-SumWithoutMissingNo));
    }
}
