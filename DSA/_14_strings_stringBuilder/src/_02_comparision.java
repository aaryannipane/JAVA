public class _02_comparision {
    public static void main(String[] args) {
        // '==' checks that both variables points to same value or not if yes then true else false
        // both variables are pointing to same object
        String a = "Aryan";
        String b = "Aryan";
        System.out.println(a==b); // true

        // creating two diff variables with pointing to diff same value objects
        String c = new String("Nipane");
        String d = new String("Nipane");
        // comparing with '==' gives false cause variable are pointing to diff objects that are made outside the pool
        System.out.println(c==d); // false

        // for comparision of values we can use equals() method of string
        System.out.println(c.equals(d));

        // get any character at any index
        System.out.println(c.charAt(0));
    }
}
