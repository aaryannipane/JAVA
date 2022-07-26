import java.util.Scanner;

public class _02_sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value in x :");
        int x = in.nextInt();
        System.out.print("Enter value in y :");
        int y = in.nextInt();

        int sum = x + y;
        System.out.println("Sum of x and y is : " + sum);

    }
}
