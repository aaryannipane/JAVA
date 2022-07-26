

// in this we dont know the given array is sorted in asc or dsc
public class _2_orderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};  // asc array
        int[] arr = {7,6, 5, 4, 3, 2, 1};     // dsc array

        System.out.println(orderAgnosticBS(arr, 5));
    }

    static int orderAgnosticBS(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

//        check array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2; // to avoid exceed value in mid

            if(target == arr[mid])
                return mid;

            if(isAsc){
//                for asc order array
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else if(target < arr[mid]){
                    end = mid - 1;
                }
            }
            else {
//                for dsc order array
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else if(target > arr[mid]){
                    end = mid - 1;
                }
            }
        }

//        target not found
        return -1;

    }

}
