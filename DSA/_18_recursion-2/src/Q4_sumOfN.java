public class Q4_sumOfN {
    public static void main(String[] args) {
        System.out.println(sumOfN(5));
    }

    static int sumOfN(int n){
        if(n<=1){
            return 1;
        }

        return n + sumOfN(n-1);
    }
}
