package com.Aryan;

import java.util.Scanner;

public class Q2_weekdays_weekends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // display day name b/w 1 & 7

        System.out.println("Enter day in integer from 1 to 7:- ");
        int day = in.nextInt();

        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekends");
                break;
        }
    }
}
