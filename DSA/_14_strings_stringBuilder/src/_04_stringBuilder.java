public class _04_stringBuilder {
    public static void main(String[] args) {
        // we is imutable so adding string will always create new object and assign it to a variable
        String value = "";
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
            value = value + ch;
        }

        System.out.println(value);  // it takes O(N^2);


        // solution for this is using StringBuilder we can mutate StringBuilder object and it will not create new object every time
        // it takes O(N)
        StringBuilder value2 = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            value2.append(ch);
        }
        System.out.println(value2);

        // learn more about String and StringBuilder methods.
    }
}
