package Introduction_to_OOP;

import java.util.Scanner;

class Area {
    int length;
    int breadth;
    public Area(int l,int b){
        length=l;
        breadth=b;
    }
        public int returnArea(){
            return length*breadth;
        }

}
public class main3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length:");
        int a= sc.nextInt();
        System.out.println("Enter breadth:");
        int b= sc.nextInt();

        Area obj= new Area(a,b);
        System.out.println("Area="+obj.returnArea());
    }
}
