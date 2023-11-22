// normal triangle

class Triangle{
    public static void main(String[] args) {
        int n = 5;

        // for(int i=0; i<5; i++){
        //     // space
        //     for(int j=0; j<n-i-1; j++){
        //         System.out.print(" ");
        //     }
        //     // left star
        //     for(int j=0; j<2*i+1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // pascal triangle template with *
        for(int i=0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                int num = combi(i, j);
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }

    static int fact(int n){
        int total = 1;
        while(n>=1){
            total *= n;
            n--;
        }

        return total;
    }

    static int combi(int n, int r){
        return (fact(n) / (fact(n-r) * fact(r)));
    }
}