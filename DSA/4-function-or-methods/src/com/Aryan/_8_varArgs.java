package com.Aryan;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class _8_varArgs {
    public static void main(String[] args) {
        func(1,2,3,4,5,6,7,8,9,10);

        multiple(10, 20, "Aryan", "Nipane", "Babu");
    }

    // when we don't know how many arguments we are going to pass in function than we use varArg (variable length arguments)
    // we use "...(name of array)" this will give array of data type specified
    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){
        System.out.println(a + "\n" + b + "\n" + Arrays.toString(v));
    }
}
