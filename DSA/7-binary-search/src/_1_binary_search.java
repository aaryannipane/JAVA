
public class _1_binary_search{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(binarySearch(arr, 4));
    }


//    search in array that is in ascending order
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2; // to avoid exceed value in mid

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else {
                // target found
                return mid;
            }
        }

//        target not found
        return -1;
    }
}