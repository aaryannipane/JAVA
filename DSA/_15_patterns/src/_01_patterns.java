public class _01_patterns {
    public static void main(String[] args) {
        pattern1(4);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(4);
        System.out.println();
        pattern5(4);

    }

//    https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

    public static void pattern1(int n){
        for (int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void pattern3(int n){
        for (int row=1; row<=n; row++){
            for(int col=1; col<=n+1-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for (int row=1; row<=n; row++){
            for (int col=1; col<=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for (int row=0; row<2*n; row++){
            int totalColsInRows = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern28(int n){
        for (int row=0; row < 2 * n; row++){

        }
    }
}
