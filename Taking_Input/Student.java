package Taking_Input;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        System.out.println("Enter your Name RollNo. and field of intrest in a single line");
        Scanner details = new Scanner(System.in);
        String first_name= details.next();
        String second_name= details.next();
        int rollNo= details.nextInt();
        String field_of_interest= details.next();
        System.out.println("Name:"+first_name+" "+second_name);
        System.out.println("Roll No:"+rollNo);
        System.out.println("Entered Field of intrest:"+field_of_interest);

    }
}
