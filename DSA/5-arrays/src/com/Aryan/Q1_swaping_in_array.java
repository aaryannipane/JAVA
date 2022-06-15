package com.Aryan;

import java.util.Arrays;

public class Q1_swaping_in_array {
    public static void main(String[] args) {
        int[] arr = {2, 32, 43, 2, 1};

        swap(arr, 1, 3);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){

//        array is mutable so changes made in function will change original array

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
