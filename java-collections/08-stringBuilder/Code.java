class Code {
    public static void main(String[] args) {

        // https://www.javatpoint.com/StringBuilder-class
        // creating string builder
        // Java StringBuilder Class
        // Java StringBuilder class is used to create mutable (modifiable) String.
        // The Java StringBuilder class is same as StringBuffer class except that it is
        // non-synchronized.
        // It is available since JDK 1.5.
        StringBuilder sb = new StringBuilder();

        // 1) StringBuilder append() method
        // The StringBuilder append() method concatenates the given argument with this String.
        // appends element at last 

        sb.append("Hello");
        System.out.println(sb);

        // 2) StringBuilder insert() method
        // The StringBuilder insert() method inserts the given string with this string
        // at the given position.

        sb.insert(1, "OLA");
        System.out.println(sb);

        // 3) StringBuilder replace() method
        // The StringBuilder replace() method replaces the given string from the
        // specified beginIndex and endIndex (excluding end ).

        sb.replace(1, 4, "ALU");
        System.out.println(sb);

        // 4) StringBuilder delete() method
        // The delete() method of StringBuilder class deletes the string from the
        // specified beginIndex to endIndex (excluding end).

        sb.delete(1, 4);
        System.out.println(sb);

        // 5) StringBuilder reverse() method
        // The reverse() method of StringBuilder class reverses the current string.

        sb.reverse();
        System.out.println(sb);
    }
}
