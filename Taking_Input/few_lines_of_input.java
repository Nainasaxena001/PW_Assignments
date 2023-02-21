package Taking_Input;

import java.util.Scanner;

public class few_lines_of_input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNextLine()){
            String a=sc.nextLine();
            String b= sc.nextLine();

            System.out.println(a+b);
        }
    }
}
