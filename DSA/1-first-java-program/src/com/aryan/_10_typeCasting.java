package com.aryan;

import java.util.Scanner;

public class _10_typeCasting {
    public static void main(String[] args) {
//        when one type of data is assigned in another type of variable
//        and then automatic coversion takes place is knows as type conversion
//        type should be compatible like numbers for numbers etc
//        there should be conversion from small to big data type ex:-
        Scanner input = new Scanner(System.in);
        System.out.println("Enter INT value in Float variable: ");
        float num = input.nextFloat();
//      here we can pass integer value cause int is smaller than float
        System.out.println(num);


        System.out.println("---------------CASTING----------------");

//      we can't put float value in int variable it will throw error
//      cause float is bigger than int so it will not be converted

//      if we want to convert float to int then
//      we use TYPE CASTING like (data type)(value) same as c language
//      it is also called as EXPLICIT CONVERSION
        int a = (int)(45.01f);
        System.out.println(a);

    }
}
