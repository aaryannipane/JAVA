import java.util.Scanner;

public class _01_odd_even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number:");
        int x = in.nextInt();

        // we can check the
        // number's binary 1st digit to determine if it is odd or even
        // if 1 then odd else even

        // to check that we can perform a & 1 operation on number to get 1st digit
        if((x & 1) == 1){
            System.out.println("number is odd");
        }else {
            System.out.println("number is even");
        }
    }
}
