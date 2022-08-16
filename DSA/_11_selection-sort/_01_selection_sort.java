import java.util.Arrays;

public class _01_selection_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
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
