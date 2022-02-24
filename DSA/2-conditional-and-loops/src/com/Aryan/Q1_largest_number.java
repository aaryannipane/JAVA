package com.Aryan;

import java.util.Scanner;

public class Q1_largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter value for x, y, x:-");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        // Q1 Find the largest of the three numbers

        int max = x; //assume max is x

        if(y > max) {
            max = y;
        }
        if(z > max){
            max = z;
        }

        System.out.print("max value is " + max);
    }
}
