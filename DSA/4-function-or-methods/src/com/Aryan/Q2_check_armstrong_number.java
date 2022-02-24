package com.Aryan;

import java.util.Scanner;

public class Q2_check_armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Three digit number: ");
        int num = input.nextInt();

        System.out.println(isArmstrong(num));

    }

//    In number theory, a narcissistic number in a given number base b is a number
//    that is the sum of its own digits each raised to the power of the number of digits

    static boolean isArmstrong(int n){
        int x = n;
        int r, sum = 0;
        while(x>0){
            r = x%10;
            sum = sum + r*r*r;
            x = x/10;
        }

        if(sum == n){
            return true;
        }
        else{
            return false;
        }
    }
}
