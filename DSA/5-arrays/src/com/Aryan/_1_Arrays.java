package com.Aryan;

public class _1_Arrays {

    public static void main(String[] args) {
	    // Arrays:
        // arrays is collection of same data of same type ex:- int {10, 20, 30}

        /*
        Syntax:-
            datatype[] variable_name = new datatype[size];
         */

//
//        int[] roll = new int[5];
//        // OR
//        int[] roll2 = {10, 20, 30, 40};

        int[] roll; // declaration of array, roll is getting defined in stack
        roll = new int[5]; // actually here object is created in the memory(heap memory) and roll is pointing to it
        // new is used to create an object in memory at runtime

        int[] nos = {23, 34, 54, 56};

        // memory location depends on jvm whether it is in continuous or not
        // array objects are in heap memory

        // ACCESS THE VALUE IN ARRAY USING INDEX NUMBER
        System.out.println(nos[0]);

        // CHANGE ELEMENT OF ARRAY USING INDEX NUMBER
        nos[3] = 65;

        // int array without initialised value has 0 value of the elements
        // String array which is not initialised has null value in it

        // array of objects
        String []arr = new String[5];
        //[ref_var, ref_var, ref_var, ref_var, ref_var]


        // FOR EACH LOOP
        for (int num : nos) {
            System.out.println(nos[num]);
        }

    }
}
