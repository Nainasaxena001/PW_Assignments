package Taking_Input;

import java.util.Scanner;

public class Sum_Taking_Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <= t ; i++) {
            int first =sc.nextInt();
            int second =sc.nextInt();
            System.out.println(first+second);

        }
    }
}
