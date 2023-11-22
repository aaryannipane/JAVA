public class Q6_reverseNumber {
    static int rev = 0;

    static void reverseNum(int n){
        if(n==0){
            return;
        }

        rev = (rev*10) + n%10;

        reverseNum(n/10);
    }

    public static void main(String[] args) {
        int n = 1234;
        reverseNum(n);
        System.out.println(rev);
    }
}
