package com.aryan;

import java.util.Scanner;

public class _3_Input {
    public static void main(String[] args){
//   input from user from keyboard
//   we can take input from user by Scanner class
//   and it is present in (import java.util.Scanner;)
//   we have to create a scanner object with new keyword.
//   inside the object we have to pass from where we are taking input
//   it can be file, keyboard etc to take input from user we use System.in
        Scanner input = new Scanner(System.in);
//   using this input object we can take input from the user by keyboard

//   to take input of number we use method nextInt of object input
        System.out.print("Enter a Number: ");
        System.out.println(input.nextInt());
//   to take input of string we use next method
        System.out.print("Enter a String: ");
        System.out.println(input.next());
//   to take entire line we use nextLine method
        System.out.print("Enter a sentence: ");
        System.out.println(input.nextLine());
    }
}
