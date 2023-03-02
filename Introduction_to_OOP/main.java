package Introduction_to_OOP;

class Student {
    int roll_no;
    String name;
}
public class main{
    public static void main(String[] args) {
        System.out.println("Details:");
        Student s= new Student();

        s.roll_no=2;
        s.name="John";

        System.out.println("roll_no:"+s.roll_no);
        System.out.println("Name:"+s.name);

    }

}
