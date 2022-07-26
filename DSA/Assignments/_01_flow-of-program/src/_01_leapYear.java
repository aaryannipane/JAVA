import java.util.Scanner;

public class _01_leapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year;
        System.out.print("Enter any year : ");
        year = in.nextInt();

//        LEAP YEAR CONDITIONS
        /*
        * 1 -> year should be divisible by 400
        * 2 -> year should not be divisible by 100
        * 3 -> year should be divisible by 4
        * */

        // leap year if perfectly divisible by 400
        if(year % 400 == 0){
            System.out.println(year + " Year is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println(year + " Year is not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println(year + " Year is a Leap Year");
        } else {
            System.out.println(year + " Year is not a Leap Year");
        }

    }
}
