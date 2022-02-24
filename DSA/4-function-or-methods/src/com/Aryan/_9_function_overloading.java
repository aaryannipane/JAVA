package com.Aryan;

public class _9_function_overloading {
    public static void main(String[] args) {
        // two functions having same name, return type
        // but different arguments or number of arguments
        // is known as function overloading
        fun(20);
        fun("Aryan Nipane");
        // during compile time it will be know which function to run
        // a function with int argument or function with String argument
    }

    static void fun(int num){
        System.out.println("First fun function");
        System.out.println(num);
    }

    static void fun(String name){
        System.out.println("Secong fun function");
        System.out.println(name);
    }

}
