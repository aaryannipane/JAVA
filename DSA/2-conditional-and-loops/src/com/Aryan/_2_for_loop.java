package com.Aryan;

import java.util.Scanner;

public class _2_for_loop {
    public static void main(String[] args) {
        // for loop
        /*
            syntax :-
            for(init; condition; increment or decrement){
                body
            }
        */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int j = in.nextInt();

        for(int i=1; i<=j; i++){
            System.out.println(i);
        }
    }
}
