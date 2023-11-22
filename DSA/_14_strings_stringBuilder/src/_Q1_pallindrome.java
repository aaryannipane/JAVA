public class _Q1_pallindrome {
    public static void main(String[] args) {
        String value = "abcdcba";
        System.out.println(check(value));
    }

    // check if string is palindrome or not
    static boolean check(String value){
        if(value == null || value.length() == 0){
            return true;
        }

        for (int i = 0; i <= value.length() - 1; i++) {
            char start = value.charAt(i);
            char end = value.charAt(value.length() - 1 - i);
            if(start != end){
                return  false;
            }
        }

        return true;
    }
    
}
