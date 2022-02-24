package com.aryan;

import java.util.Scanner;

public class _12_char_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);
        System.out.println(ch);

        // trim() is used to remove space from start and end of string
        // charAt(0) is character at 0 index in string
    }
}
