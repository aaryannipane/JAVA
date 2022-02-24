package com.aryan;
// package is the path folder name of this file where the file is present

//class name should be same as name of the file
//public is used for that we can access main class from any other file, package etc
//class contains methods and propertys
public class _1_Main{
    // main is reserved keyword code starts execution from main() func or method
    // static function is used to use main() without creating object of Main class
    // void is return data type
    // public is used for accessing main() from anywhere
    // String[] args is a command line argument
    public static void main(String[] args){
        // System class has variable out that refers or point to PrintStream class inside that class there is method println()
        System.out.println("Hello World");
        // it is use to print output in terminal
    }

    // we can store byte code of this file in different folder by simply using
    // javac -d folder-path Main.java
    // eg:- javac -d ../ Main.java
}