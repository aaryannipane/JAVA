package com.Aryan;

import java.util.Arrays;
import java.util.Scanner;

public class _2_Array_input {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];


        for(int i=0; i<arr.length; i++){
            System.out.println("Enter value at " + i);
            arr[i] = in.nextInt();
        }

//        display elements of array
        for(int j = 0; j<arr.length; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println("\n");

//        display in shorter method
        for(int num : arr){
            System.out.print(num + " ");  // here num is element of array
        }

//        another method
        System.out.println(Arrays.toString(arr));
    }

}
