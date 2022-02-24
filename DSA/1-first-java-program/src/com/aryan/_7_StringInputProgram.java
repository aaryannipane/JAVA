package com.aryan;

import java.util.Scanner;

public class _7_StringInputProgram {
    public static void main(String[] args) {
        //    PROGRAM TO TAKE STRING AS INPUT
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String student = input.next();
        System.out.println(student);

        

        System.out.print("Enter Address: ");
        String address = input.nextLine();
        System.out.println(address);
    }
}
