package com.Aryan;

public class _1_if_else_condition {

    public static void main(String[] args) {

        /*
            syntax is
            if(boolean expression T or F){
                body
            }else{
               body
            }
        */

        int salary = 25_000;
        if(salary > 10_000){
            salary += 2000;
        }else {
            salary += 1000;
        }

        System.out.println("salary is " + salary + "\n");


        // else-if statement
        int age = 10;
        if(age>=19){
            System.out.println("allowed");
        }
        else if (age >= 10){
            System.out.println("partial allowed");
        }
        else if (age < 10){
            System.out.println("Not allowed");
        }
        else{
            System.out.println("please enter correct age");
        }
    }
}
