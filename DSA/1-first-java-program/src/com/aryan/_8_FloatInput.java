package com.aryan;

import java.util.Scanner;

public class _8_FloatInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter score: ");
        float score = input.nextFloat();
        System.out.println("Score is " + score);
    }
}
