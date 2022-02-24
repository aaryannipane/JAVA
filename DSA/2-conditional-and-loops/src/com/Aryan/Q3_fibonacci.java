package com.Aryan;

import java.util.Scanner;

public class Q3_fibonacci {
    public static void main(String[] args) {

        // Find n'th fibonacci number

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number :- ");
        int n = input.nextInt();

        int t1=0, t2=1, temp;
        int i = 2;
        while(i<=n){

            temp = t2;
            t2 = t2 + t1;
            t1 = temp;

            i++;
        }

        System.out.println(t2);
    }
}
