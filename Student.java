import java.util.*;

 class Student {

    int roll_no;
    String name;
    double ygpa;

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.roll_no = 8;
        s.name = "Sam";
        s.ygpa = 7.6;
        s.printDetails();
        
    } 
    public void printDetails(){
        System.out.println("Roll no. "+roll_no);
        System.out.println("Name is "+name);
        System.out.println("YGPA is "+ygpa);
    }
}
