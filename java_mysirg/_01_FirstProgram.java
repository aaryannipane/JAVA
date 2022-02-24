import java.util.Scanner;

public class _01_FirstProgram{
    // static variable or method can only call using class name only and not with object
    static int a = 10; 

    // static function i=onky called with class name thats why file name is same as class name cause jvm to know the class name and to call main function/method using it
    public static void main(String[] args){
        // we can use static variable inside static function 
        System.out.println("Hello World "+ _01_FirstProgram.a); 

        // to take input we have to create object of scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Name : ");
        String name = input.next();
        System.out.println("Hello " + name);

    }
}