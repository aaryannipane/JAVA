package com.Aryan;

public class _5_scopes {
    public static void main(String[] args) {
        int num = 10; // it has scope only inside main function
        // we can't access num variable outside main function

        //can't access name varible in main function
//        System.out.println(name);
    }

    static void random(){
        String name = "Aryan";
        // this string data type variable can be access only in random function

        // can't access num variable in random function
//        System.out.println(num);
    }
}

