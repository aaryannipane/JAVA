import java.lang.reflect.Array;
import java.util.Arrays;

public class _01_binary_search_2d_array {
    public static void main(String[] args) {
        // matrix is sorted in row wise and col wise manner
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 37)));

    }

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c=matrix.length - 1;

        while (r < matrix.length && c >=0) {
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(matrix[r][c] < target){
                r++;
            }
            if(matrix[r][c] > target){
                c--;
            }
        }

        return new int[]{-1,-1};
    }
}
