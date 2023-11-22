public class _01_string {
    public static void main(String[] args) {
        // string is class and we create object of it and object is stored in heap memory
        // strings are stored in string pool in heap memory
        // two variables with same value of string points to same object in string pool
        // strings are immutable for security reasons
        String name = "Aryan Nipane";
        System.out.println(name);
    }
}
