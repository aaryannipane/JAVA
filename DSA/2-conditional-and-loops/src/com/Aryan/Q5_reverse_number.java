package com.Aryan;

public class Q5_reverse_number {
    public static void main(String[] args) {
        // write a program to reverse a number

        int num = 1234;
        int ans = 0;

        while(num > 0){
            int rem = num % 10;
            num /=10;
            ans = ans*10 + rem; // to reverse string
        }

        System.out.println(ans);
    }
}
