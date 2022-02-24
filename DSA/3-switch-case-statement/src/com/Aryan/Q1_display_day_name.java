package com.Aryan;

import java.util.Scanner;

public class Q1_display_day_name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // display day name b/w 1 & 7

        System.out.println("Enter day in integer from 1 to 7:- ");
        int day = in.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
