public class Q5_sumOfDigits {
    public static void main(String[] args) {
        System.out.println(SOD(123));

    }

    static int SOD(int n){
        if(n%10 == n){
            return n;
        }

        return (n%10) + SOD(n/10);
    }
}
