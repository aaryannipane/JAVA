package com.Aryan;

public class _7_shadowing {
    static int x=90; // this will be shadowed at line 7
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 80;
        System.out.println(x); // 80
        fun();
    }

    static void fun(){
        System.out.println(x); // 90
    }
}
