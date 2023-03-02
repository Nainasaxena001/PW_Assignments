package Introduction_to_OOP;
class Employee{
    String Name;
    int yoj;
    String Address;
}
public class main5 {
    public static void main(String[] args) {
        Employee a= new Employee();
        a.Name= "Robert";
        a.yoj=1994;
        a.Address="64C-WallsStreet";

        Employee b= new Employee();
        b.Name= "Sam";
        b.yoj=2000;
        b.Address="68D-WallsStreet";

        Employee c= new Employee();
        c.Name= "John";
        c.yoj=1999;
        c.Address="26B-WallsStreet";

        System.out.println("Name:  "+"Year of Joining:  "+"Address:  ");
        System.out.println(a.Name+"  "+a.yoj+"  "+a.Address);
        System.out.println(b.Name+"  "+b.yoj+"  "+b.Address);
        System.out.println(c.Name+"  "+c.yoj+"  "+c.Address);
    }
}
