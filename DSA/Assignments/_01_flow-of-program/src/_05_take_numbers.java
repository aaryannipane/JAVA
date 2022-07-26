import java.util.Scanner;

public class _05_take_numbers {
    // Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum=0;


        while (true) {
            System.out.println("Enter number to continue (X for exit):");
            String value = in.next();

            if(value.equals("x")) {
                break;
            }

            sum += Integer.parseInt(value);
        }

        System.out.println(sum);
    }
}
