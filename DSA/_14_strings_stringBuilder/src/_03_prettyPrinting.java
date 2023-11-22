import java.sql.SQLOutput;
import java.util.ArrayList;

public class _03_prettyPrinting {
    public static void main(String[] args) {
        float a = 458.12345f;
        // printing only two digits after decimal
        System.out.printf("Formated number is %.2f \n", a);
        System.out.printf("Pie Value is %.3f\n", Math.PI);
        System.out.printf("Hello my name is %s and i am %s\n", "Aryan", "Cool");

        // operator
        System.out.println('a' + 'b');
        System.out.println("a" + 'b');
        System.out.println("a" + "b");
        System.out.println("Aryan" + 3);  // 3 will converted to Integer object then .toString method is applied
        System.out.println("Aryan" + new ArrayList<>()); // ArrayList is converted toString by calling method
        System.out.println(new Integer(24) + "" + new ArrayList<>());
        System.out.println((char)('a' + 1)); // returns b
    }
}
