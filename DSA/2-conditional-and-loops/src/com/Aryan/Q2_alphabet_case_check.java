package com.Aryan;

import java.util.Scanner;

public class Q2_alphabet_case_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character:- ");
        char ch = input.next().trim().charAt(0);

        if(ch >='a' && ch <='z'){
            System.out.print("Lowercase");
        }else if(ch >='A' && ch <='Z'){
            System.out.print("Uppercase");
        }

    }
}
