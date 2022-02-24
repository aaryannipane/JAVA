package com.Aryan;

import java.util.Scanner;

public class _3_while_loop {
    public static void main(String[] args){
        // while loop
        /*
        intitialiazation of variable
        while(condition){
            body
            incrementation of variable
        }
        */

        // use while loop when you don't know how many times the loop is going
        // to run

        // eg:- take input from user until user press x
        // (here we don't know how many times loop is going to run)

        int num=1;
        while(num <=10){
            System.out.println(num);
            num = num+2;
        }



    }

}
