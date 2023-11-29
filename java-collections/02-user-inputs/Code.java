import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = inp.nextLine();
        inp.close();

        System.out.println("Your name is " + name);
    }
}
