package com.Aryan;

import java.util.Arrays;
//primitive data type is pass by value
//non primitive data type is also pass by value but the modification can change the original object
public class _4_pass_by_value {
    public static void main(String[] args) {

        // strings are immutable
        String name = "Aryan";
        changeName(name); // this function will not change original value of name
        System.out.println(name);

        // creating array
        int[] nums = {10, 22, 42, 12, 4};
        changeArray(nums); // this will modify the nums array
        System.out.println(Arrays.toString(nums));
    }

    static void changeName(String naam){
        naam = "Babu"; // here new object is created
    }

    static void changeArray(int[] arr){
        arr[0] = 99; // this will modify the same object of nums
    }
}
