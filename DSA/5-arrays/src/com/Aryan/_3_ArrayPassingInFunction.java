package com.Aryan;

import java.util.Arrays;

public class _3_ArrayPassingInFunction {
    public static void main(String[] args) {
        int []num = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change(int []arr){
        arr[0] = 33; // changes value of original array object in heap
    }
}
