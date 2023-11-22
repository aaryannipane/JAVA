import java.util.Arrays;

public class _01_selection_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    // small element to left
    static void selection_sort2(int[] arr){
        int n = arr.length;
        for(int i=0; i<=n-2; i++){
            int mini = i;
            for(int j=i; j<=n-1; j++){
                if(arr[j] < arr[mini]) mini = j;
            }

            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }

//    max element to right
    static void selection_sort(int[] arr){
        // select max element and swap it to right
        for(int i = 0; i<arr.length-1; i++){
//            get random max from right to left
            int max = arr.length-i-1;
            for(int j = 0; j<arr.length-i;j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
                System.out.println(arr[j] + " " + arr[max]);
            }

            // swap
            int temp = arr[max];
            arr[max] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int last = arr.length-1-i;
            int maxPos = max(arr, last);
            swap(arr, maxPos, last);
        }
    }

    public static int max(int[] arr, int end){
        int maxIndex = 0;
        for(int i=0; i<=end; i++){
            if(arr[maxIndex] < arr[i]){
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
