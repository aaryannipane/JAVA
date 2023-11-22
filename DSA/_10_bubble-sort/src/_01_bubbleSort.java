import java.util.Arrays;

public class _01_bubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 80, 4, 60, 5};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0; i < arr.length - 1; i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                    swapped = true;
                }
            }
//            if not swapped in first iterations that means array is already sorted then we will close function
            if(!swapped){
                return;
            }
        }
    }
}
