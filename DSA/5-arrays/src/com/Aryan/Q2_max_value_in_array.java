package com.Aryan;

public class Q2_max_value_in_array {

    public static void main(String[] args) {

        int[] arr = {1, 2, 30, 4, 5};

        // max value in entire array
        System.out.println(max(arr));

        // max value in range of array
        System.out.println(max_value_in_range(arr, 1, 4));
    }

    static int max(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int max_value_in_range(int[] arr, int start_index, int end_index){
        int max = arr[start_index];
        for(int i=start_index+1; i<= end_index; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
