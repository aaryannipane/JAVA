package com.Aryan;

import java.util.*;

public class _4_2d_array {
    public static void main(String[] args) {
        // declaration of 2d array
        int[][] arr1 = new int[3][3]; // array of 3 rows and 3 cols
        /*
           {{1 2 3},
           {4 5 6},
           {7 8 9}}
        */

        // initialisation of 2d array
        int[][] arr2 = {
                {1,2,3}, // 0 index
                {4,5},   // 1 index  // we can store array with different size in 2d array
                {6,7,8}  // 2 index
        };

        Scanner input = new Scanner(System.in);

        // input in 2d-array
        for(int row=0; row < arr1.length; row++){ // for number of rows
            for(int col=0; col < arr1[row].length; col++){ // for number of cols
                System.out.println("Enter Value in "+row+" Row and "+ col+ " Cols:");
                arr1[row][col] = input.nextInt();
            }
        }

        // output in 2d-array;
//        for(int row=0; row < arr1.length; row++){ // for number of rows
//            for(int col=0; col < arr1[row].length; col++){ // for number of cols
//                System.out.print(arr1[row][col]+", ");
//            }
//            System.out.print('\n');
//        }

//        second method to print 2d-array by conerting array row to string
//            for(int row=0; row < arr1.length; row++){ // for number of rows
//                System.out.println(Arrays.toString(arr1[row]));
//            }

//        enhanced for loop to print array
        for(int[] a : arr1){
            System.out.println(Arrays.toString(a));
        }
    }
}
