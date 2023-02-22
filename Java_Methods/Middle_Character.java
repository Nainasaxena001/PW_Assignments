package Java_Methods;

import java.util.Scanner;

public class Middle_Character {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(Middle(s));
    }
    public static String Middle(String s){
        if(s.length()%2==0){
            return s.substring(s.length()/2-1,s.length()/2+1);
        }
        else {
            return s.substring(s.length()/2,s.length()/2+1);
        }
    }
}
