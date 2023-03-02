package Introduction_to_OOP;

import java.util.Scanner;

class Complex{
    int real;
    int img;

    public Complex(int r, int i){
        real=r;
        img=i;
    }
    public static Complex add(Complex a,Complex b){
        return new Complex((a.real+ b.real),(a.img+ b.img));
    }
    public static Complex subtract(Complex a,Complex b){
        return new Complex((a.real- b.real),(a.img- b.img));
    }
    public static Complex multiplication(Complex a, Complex b){
        return new Complex((a.real* b.real),(a.img* b.img));
    }

    public void print(){
        System.out.println(real+"+"+img+"i");
    }
}
public class main4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter real part of first number:");
        int x= sc.nextInt();
        System.out.println("Enter img part of first number:");
        int x1 = sc.nextInt();

        System.out.println("Enter real part of second number:");
        int y= sc.nextInt();
        System.out.println("Enter img part of second number:");
        int y1 = sc.nextInt();

        Complex C1= new Complex( x,x1);
        Complex C2= new Complex(y,y1);
        Complex obj1= Complex.add(C1,C2);
        Complex obj2= Complex.subtract(C1,C2);
        Complex obj3= Complex.multiplication(C1,C2);

        obj1.print();
        obj2.print();
        obj3.print();
    }
}
