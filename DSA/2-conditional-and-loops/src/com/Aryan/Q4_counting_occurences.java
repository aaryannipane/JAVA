package com.Aryan;

import java.util.Scanner;

public class Q4_counting_occurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //count occurance of any given digit in numbers
        /* eg :- num = 122323  // count how many are 2 in number
                there are 3 occurances of 2 in number
        */
        System.out.println("Enter numbers:- ");
        int num = input.nextInt();
        System.out.println("Enter number to find occurance of:- ");
        int n = input.nextInt();
        int count = 0;

        while(num > 0){
            int rem = num % 10;  // gives last digit of number
            if(rem == n){
                count++;
            }
            num = num / 10;  // remove the last digit from number
        }

        if(count > 0){
            System.out.print("number "+ n +" Occured " +count+ " times in number");
        }
        else{
            System.out.println("No Occurence found");
        }
    }
}
