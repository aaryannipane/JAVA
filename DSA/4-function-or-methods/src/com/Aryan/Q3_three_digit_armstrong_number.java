package com.Aryan;

public class Q3_three_digit_armstrong_number {
    public static void main(String[] args) {
        // program to print all three digit armstrong numbers

        for(int i=100; i<1000; i++){
            if(isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

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
