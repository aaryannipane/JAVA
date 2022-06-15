package code;

public class _6_maxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {-10,43,23},
                {10,4,75},
                {87,45,34}
        };

        System.out.println(max(arr));
        System.out.println(min(arr));

//        minimum value in integer
        System.out.println(Integer.MIN_VALUE);
    }

    static int max(int[][] arr){
//        assume array length is not 0

        int max = arr[0][0];

        for(int row=0; row<arr.length; row++){
            for (int col=0; col<arr[row].length; col++) {
                if (arr[row][col] > max)
                    max = arr[row][col];
            }
        }
        return max;
    }

    static int min(int[][] arr){
//        assume array length is not 0

        int min = arr[0][0];

        for(int row=0; row<arr.length; row++){
            for (int col=0; col<arr[row].length; col++) {
                if (arr[row][col] < min)
                    min = arr[row][col];
            }
        }
        return min;
    }
}
