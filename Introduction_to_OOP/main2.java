package Introduction_to_OOP;

class Triangle{
    int a,b,c;
    public double getArea(){
        double area= (a*b)/2;
        return area;
    }
    public double getParameter(){
        double parameter= a+b+c;
        return parameter;
    }
}
public class main2 {
    public static void main(String[] args) {
        Triangle s= new Triangle();
        s.a=3;
        s.b=4;
        s.c=5;
        System.out.println("Area="+s.getArea());
        System.out.println("Parameter="+s.getParameter());
    }
}
  