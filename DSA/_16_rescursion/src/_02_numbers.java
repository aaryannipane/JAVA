public class _02_numbers {
    public static void main(String[] args) {
        // print 5 numbers
        print1(1);


    }

    static void print1(int n){
        System.out.println(n);
        print2(++n);
    }
    static void print2(int n){
        System.out.println(n);
        print3(++n);
    }
    static void print3(int n){
        System.out.println(n);
        print4(++n);
    }
    static void print4(int n){
        System.out.println(n);
        print5(++n);
    }
    static void print5(int n){
        System.out.println(n);
    }

}
