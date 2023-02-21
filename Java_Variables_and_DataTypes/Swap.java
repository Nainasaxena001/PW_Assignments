package Java_Variables_and_DataTypes;

public class Swap {
    public static void main(String[] args) {
       int a=2;
       int b=3;
        System.out.println("First number before swapping="+a);
        System.out.println("Second number before swapping="+b);

        int temp; //Variable used for swapping.

        temp=a;
        a=b;
        b=temp;

        System.out.println("First number after swapping="+a);
        System.out.println("Second number after swapping="+b);
    }
}
