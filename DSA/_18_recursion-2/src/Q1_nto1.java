public class Q1_nto1 {
    public static void main(String[] args) {
        func(5);
    }

    static void func(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        func(n-1);
    }
}
