import java.util.Arrays;

public class Code {
    public static void main(String[] args) {
        // Link: https://www.w3schools.com/java/java_ref_string.asp

        String username = "aryannipane";

        // toCharArray() converts string to char array
        char[] arr = username.toCharArray();

        // charAt() Returns the character at the specified index (position)
        System.out.println("charAt " + username.charAt(2));

        // codePointAt() Returns the Unicode of the character at the specified index
        System.out.println("codePointAt " + username.codePointAt(0));

        // codePointBefore() Returns the Unicode of the character before the specified
        // index
        System.out.println("codePointBefore " + username.codePointBefore(5));

        // codePointCount() Returns the number of Unicode values found in a string.
        System.out.println("codePointCount " + username.codePointCount(0, username.length() - 1));

        // compareTo() Compares two strings lexicographically
        /*
         * Definition and Usage
         * The compareTo() method compares two strings lexicographically.
         * 
         * The comparison is based on the Unicode value of each character in the
         * strings.
         * 
         * The method returns 0 if the string is equal to the other string. A value less
         * than 0 is returned if the string is less than the other string (less
         * characters) and a value greater than 0 if the string is greater than the
         * other string (more characters).
         * 
         * Tip: Use compareToIgnoreCase() to compare two strings lexicographyically,
         * ignoring lower case and upper case differences.
         * 
         * Tip: Use the equals() method to compare two strings without consideration of
         * Unicode values.
         */
        System.out.println("compareTo " + username.compareTo("aryan")); 

        // compareToIgnoreCase() compareToIgnoreCase()
        System.out.println(username.compareToIgnoreCase("aryannipanE"));

        // concat()	Appends a string to the end of another string
        System.out.println(username.concat(" is your username"));

        // contains()	Checks whether a string contains a sequence of characters
        System.out.println(username.concat(" nipane"));

        // contentEquals()	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer
        System.out.println(username.contentEquals("nipane"));


        char[] mystr = {'A', 'R', 'Y', 'A', 'N'};
        String name = "";

        // copyValueOf()	Returns a String that represents the characters of the character array
        name = String.copyValueOf(mystr, 0, 3);
        System.out.println(name);

        // endsWith()	Checks whether a string ends with the specified character(s)
        System.out.println(username.endsWith("pane"));

        // equals()	Compares two strings. Returns true if the strings are equal, and false if not
        System.out.println(username.equals(name));

        // equalsIgnoreCase()	Compares two strings, ignoring case considerations
        System.out.println(username.equalsIgnoreCase(name));

        // getChars()	Copies characters from a string to an array of chars
        char[] letters = new char[5]; 
        username.getChars(0, 5, letters, 0);
        System.out.println(letters);

        // indexOf()	Returns the position of the first found occurrence of specified characters in a string
        System.out.println(username.indexOf("n", 0));

        // isEmpty()	Checks whether a string is empty or not
        System.out.println(username.isEmpty());

        // lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string
        System.out.println(username.lastIndexOf("yan", 0));

        // lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string
        System.out.println(username.length());

        // replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced
        System.out.println(username.replace("nipane", "sanjay"));

        String data = "10 20 30 40";
        String[] dataArr = data.split(" ");
        System.out.println(Arrays.toString(dataArr));

        // trim()	Removes whitespace from both ends of a string
        System.out.println(username.trim());

        // to Upper and lower
        System.out.println(username.toUpperCase()+ " " + username.toLowerCase());

        // https://www.javatpoint.com/substring 
        // Substring(begInd, endInd)
        // A part of String is called substring. In other words, substring is a subset of another String. Java String class provides the built-in substring() method that extract a substring from the given string by using the index values passed as an argument. In case of substring() method startIndex is "inclusive" and endIndex is "exclusive".
        System.out.println(username.substring(5));
        System.out.println(username.substring(1, 8));



    }
}
