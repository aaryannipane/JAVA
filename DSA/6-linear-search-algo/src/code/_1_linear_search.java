package code;

public class _1_linear_search {
    public static void main(String[] args) {
        int[] arr = {12, 34, 6, 2, 787};

        System.out.println(linearSearch(arr, 10));
    }

    // search in the array : return the index if item found
    // otherwise item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

}
