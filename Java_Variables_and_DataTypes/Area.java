package Java_Variables_and_DataTypes;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter length=");
        int length=input.nextInt();

        System.out.println("Enter Breadth=");
        int breadth=input.nextInt();

        int area=length*breadth;
        System.out.println("Area="+area);

    }
}

