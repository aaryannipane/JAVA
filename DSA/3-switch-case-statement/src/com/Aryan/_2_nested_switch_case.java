package com.Aryan;

import java.util.Scanner;

public class _2_nested_switch_case {
    public static void main(String[] args) {
        // nested switch case

        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String dep = in.next();

        switch (empID) {
            case 1:
                System.out.println("Aryan Nipane");
                System.out.println("Enter age :- ");
                int age = in.nextInt();
                switch (age) {
                    case 10:
                        System.out.println("Valid");
                        break;
                    default:
                        System.out.println("Not Valid");
                }

                break;
            case 2:
                System.out.println("No name");

                break;
            default:
                System.out.println("No employee is present with this ID");
                break;
        }
    }
}
