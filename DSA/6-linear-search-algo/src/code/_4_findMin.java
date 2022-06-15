package code;

// find minimum number in the array
public class _4_findMin {
    public static void main(String[] args) {
        int[] arr = {2, 34, 65, -10, 29, 4};

        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[]arr){
        if(arr.length == 0)
            return -1; // this not correct line

        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }


    static int max(int[]arr){
        if(arr.length == 0)
            return -1; // this not correct line

        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}
