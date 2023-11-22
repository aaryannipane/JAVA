public class _04_set_ith_bit {
    public static void main(String[] args) {
        // set bit means to convert any to 1
        // 1 --> 1
        // 0 --> 1
        // we can do it using mask and | operator
        int n = 10;
        int k = 2;

        int mask = 1<<k;

        System.out.println(n | mask);

    }
}
