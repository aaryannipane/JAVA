public class Q2_binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,44,55,67,87};
        int target = 1;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e){
        // base condition
        if(s>e){
            return -1;
        }

        // body
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }

        if(arr[m] > target){
            // left
            return search(arr, target, s, m-1);
        }

        // right
        return search(arr, target, m+1, e);
    }
}
