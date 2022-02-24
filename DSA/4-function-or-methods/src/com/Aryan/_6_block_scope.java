package com.Aryan;

public class _6_block_scope {
    public static void main(String[] args) {
        int a=10, b=20; // initialised outside the block

        //block scope: it is like for loop block
        {
            a=99; // access the variable but can't re-initialised again
            int c = a+b; // can initialize new varible
            // values initialised in this block will remain in this block
        }
        System.out.println(a);
//        System.out.println(c); // cannot use outside the block
    }
}
