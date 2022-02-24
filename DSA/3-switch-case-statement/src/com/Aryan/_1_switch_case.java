package com.Aryan;

class _1_switch_case{
    public static void main(String[] args) {
        // Describe fruits program using swicth case

        String fruit = "Mango";

        // switch case is faster than if statement
        switch(fruit){
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("Sweet red fruit");
                break;
            case "Orange":
                System.out.println("round fruit");
                break;
            default:
                System.out.println("No fruit");
        }

        // enhanced switch statement (work in new jdk :( )
//        switch (fruit){
//            case "Mango" -> System.out.println("Amazing fruit");
//            case "Apple" -> System.out.println("Amazing fruit");
//            case "Orange" -> System.out.println("Amazing fruit");
//        }

    }
}