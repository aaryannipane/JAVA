public class Q1_fibbonaciNumber {
    public static void main(String[] args) {
        // find nth fibonnaci number
        int ans = fib(50);
        System.out.println(ans);
    }

    static int fib(int n){
        // base case
        // if n == 0 || n == 1 return n
        if(n < 2){
            return n;
        }

        // recursive relation
        return fib(n-1) + fib(n-2);
    }
}
