public class _06_position_right_most_set_bit {
    public static void main(String[] args) {
        int n = 7;
        // 1010
        // o/p - 2
        System.out.println(n & (-n));
        // https://www.youtube.com/watch?v=fzip9Aml6og&t=4986s
    }
}
