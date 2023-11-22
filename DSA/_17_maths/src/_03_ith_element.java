public class _03_ith_element {
    public static void main(String[] args) {
        // 10 -> 1010
        // find 2nd postion bit
        // 1<<(2-1) -> 1<<1 -> 10
        // 1010 & 10
        // 1010
        // 0010
        // -> 0010 -> 2(o/p)
        int x = 10;
        int k = 3;

        int mask = 1<<(k-1);

        System.out.println(x & mask);
    }
}
