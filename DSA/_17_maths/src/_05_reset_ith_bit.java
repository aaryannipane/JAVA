public class _05_reset_ith_bit {
    public static void main(String[] args) {
        int n = 10;
        int k = 2;

        int mask = 1<<(k-1);

        // complement ~
        int maskComp = ~mask;
//        1010

        // 0 -> 0
        // 1 -> 0

        System.out.println(n & maskComp);
    }
}
