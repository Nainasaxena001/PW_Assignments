package Taking_Input;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        System.out.printf("Enter marks of any three subjects out of hundred.");
        Scanner marks= new Scanner(System.in);
        int marks1= marks.nextInt();
        int marks2= marks.nextInt();
        int marks3= marks.nextInt();

        int a= (marks1+marks2+marks3)/3;
        System.out.println("Total marks="+(marks1+marks2+marks3));
        System.out.println("Percentage="+a+ "%");
    }
}
