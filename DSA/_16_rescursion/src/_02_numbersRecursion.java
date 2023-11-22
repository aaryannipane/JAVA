public class _02_numbersRecursion {
    public static void main(String[] args) {
        // number printing using recursion
        print(1);
    }

    static void print(int n){

        // BASE CONDITION TO STOP RECURSION
        if(n == 6){
            return;
        }

        // function logic
        System.out.println(n);

        // calling same function
        print(n+1); // tail recursion cause this is last function call
    }

}
