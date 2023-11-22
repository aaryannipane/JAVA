public class __01__HCF_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(4,12));
    }

    // gcd/hcf (greatest common devisor / highest common factor)
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }

    static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
