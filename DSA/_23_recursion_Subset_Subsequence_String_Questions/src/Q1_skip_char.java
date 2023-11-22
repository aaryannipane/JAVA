public class Q1_skip_char {
    public static void main(String[] args) {
        String str = "aryan";
        skipChar("", str);

        System.out.println(skipChar2(str));
    }

    static void skipChar(String ans, String og){
        if(og.isEmpty()){
            System.out.println(ans);
            return;
        }

        char x = og.charAt(0);
        if(x == 'a'){
            skipChar(ans, og.substring(1));
        } else{
            skipChar(ans+x, og.substring(1));
        }
    }

    static String skipChar2(String og){
        if(og.isEmpty()){
            return "";
        }

        char ch = og.charAt(0);
        if(ch == 'a'){
            return "" + skipChar2(og.substring(1));
        }else{
            return ch + skipChar2(og.substring(1));
        }
    }
}
