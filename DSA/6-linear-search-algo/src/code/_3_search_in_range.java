package code;

public class _3_search_in_range {
    public static void main(String[] args) {
        int[] arr = {2, 34, 65, -10, 29, 4};

        System.out.println(search(arr, -10, 1, 4));
    }

    static boolean search(int[] arr, int target, int startIndex, int endIndex){
        if(arr.length == 0)
            return false;

        for(int i = startIndex; i<=endIndex; i++){
            if(arr[i] == target)
                return true;
        }

        return false;
    }
}
