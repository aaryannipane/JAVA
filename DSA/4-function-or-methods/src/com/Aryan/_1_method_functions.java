package com.Aryan;

import java.util.Scanner;

public class _1_method_functions {

    public static void main(String[] args) {

        // calling function / method sum()
        int result = sum();
        System.out.println(result);

    }

    /*
        function/method defination:-

        access_modifier return_type name(arguments){
            //body
            return statement;
        }
    */

    static int sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("Enter number 1:- ");
        num1 = in.nextInt();
        System.out.print("Enter number 2:- ");
        num2 = in.nextInt();
        result = num1 + num2;

        // return is result value that is int
        return result; // function ends from return
    }

}
