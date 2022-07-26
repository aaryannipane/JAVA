import java.util.Scanner;

public class _03_multiplicationTable {
//    Take a number as input and print the multiplication table for it
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int x = in.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(x + " * " + i + " = " + x*i);
        }
    }
}
