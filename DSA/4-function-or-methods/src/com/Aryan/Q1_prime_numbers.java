package com.Aryan;

import java.util.Scanner;

public class Q1_prime_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        int d = 2;

        // divisor is less than equal to square root of n
        while(d * d <= n){
            if(n%d == 0){
                return false;
            }
            d++;
        }

        if(d * d > n){
            return true;
        }
        return false;

    }

}
