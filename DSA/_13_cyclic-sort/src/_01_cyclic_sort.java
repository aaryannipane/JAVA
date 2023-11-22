import java.util.Arrays;

public class _01_cyclic_sort {
    public static void main(String[] args) {
        // use this sort when given nos from range 1 to N then use cyclic sort
        // it uses O(n) so when there is in question to use O(n) then use cycle sort
        // given N=5
//        int[] arr = {5,4,3,2,1};
        int[] arr = {5,4,4,3,1,3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int index = 0;
        while(index < arr.length){
            int correctIndex = arr[index] - 1;

            if(arr[index] != arr[correctIndex]){
                swap(arr, index, correctIndex);
            } else {
                index++;
            }
        }
    }

    static void swap(int[] arr, int index, int correctIndex){
        int temp = arr[index];
        arr[index] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
