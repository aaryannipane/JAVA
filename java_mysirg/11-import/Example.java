package pack1;

// we are going to import student class in this file   (run this file only by using [java pack1.Example] in terminal)
import pack2.Student;

public class Example{
    public static void main(String[] args){

        Student s1 = new Student(); // this class is imported from student

        s1.setRollNo(31);
        s1.setName("Aryan");

        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Name: " + s1.getName());

    }
}