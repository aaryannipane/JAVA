package code;

public class _5_searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {-10,43,23},
                {10,4,75},
                {87,45,34}
        };

        System.out.println(search(arr, 87));
    }

    static boolean search(int[][] arr, int target){
        if(arr.length == 0)
            return false;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target)
                    return true;
            }
        }

        return false;
    }
}
