package com.aryan;

import java.util.Scanner;

public class _5_IntInputProgram {
    public static void main(String[] args) { //debugger
        System.out.println("Intger Input and storing input in variable program\n");

//      creating object to take input
        Scanner input = new Scanner(System.in);

//      creating varible to store input
        int number;

//      taking input from user and storing in variable of int primitive data type
        System.out.println("Enter any number: ");
        number = input.nextInt();

//      displaying number variable value
        System.out.println("The number is :- " + number);
    }

}
