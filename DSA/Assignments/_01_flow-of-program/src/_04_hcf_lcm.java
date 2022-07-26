import java.util.Scanner;

public class _04_hcf_lcm {
//    https://www.c-sharpcorner.com/blogs/java-program-to-find-hcf-and-lcm2
//    Take 2 numbers as inputs and find their HCF(highest common factor or GCD) and LCM(Least Common Multiple).

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value in x : ");
        int x = in.nextInt();
        System.out.print("Enter value in y : ");
        int y = in.nextInt();

//        copy of numbers
        int a = x;
        int b = y;

//        HCF or GCD
        while(a != b) {
            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        int gcd = a;

        // when both a and b are equal that value is out GCD or HCF
        System.out.println("HCF or GCD of x and y is " + gcd);

        // LCM
        System.out.println("LCM of x and y is " + ((x * y) / gcd));
    }
}
