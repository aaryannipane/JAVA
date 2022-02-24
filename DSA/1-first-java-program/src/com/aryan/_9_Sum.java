package com.aryan;

import java.util.Scanner;

public class _9_Sum {
    public static void main(String[] args) {
        int a, b, sum;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        a = input.nextInt();

        System.out.print("Enter valur for b: ");
        b = input.nextInt();

        sum = a + b;
        System.out.println("total is : " + sum);

    }
}
