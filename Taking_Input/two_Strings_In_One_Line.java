package Taking_Input;

import java.util.Scanner;

public class two_Strings_In_One_Line {
    public static void main(String[] args) {
        System.out.println("Enter your name and surname:");
        Scanner name= new Scanner(System.in);
        String First= name.next();
        String Second= name.next();
        System.out.println("Entered name is:"+First+Second);
    }
}
