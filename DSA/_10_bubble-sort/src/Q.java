public class Q {
    public static void main(String[] args) {
        int rows = 5;
        int count = 1;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows-i-1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i+1; k++){
                System.out.print(count++);
            }

            System.out.print("\n");
        }
    }
}
