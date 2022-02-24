package com.aryan;

//  ANY THING THAT STARTS WITH CAPITAL LETTER IS CLASS (just representation of class)
public class _4_PrimitiveDataTypes {
    public static void main(String[] args){
//      primitive int data type size = 4 bytes
        int rollNo = 10; // by default type of number without decimal is int

//      primitive char data type size = 4 bytes
        char letter = 'c';

//      primitive float data type size =  bytes
        float marks = 98.67f; // we have to add 'f' at the end

//      primitive double data type size = 8 bytes
        double largeDecimalNumbers = 45456.453;  // by default value of number with decimal is double

//      primitve long data type size = 8 bytes
        long largeInteger = 65454568746L; // add L at the end of value

//      primitive boolean data type
        boolean check = true;

        System.out.println(rollNo+"\n"+letter+"\n"+marks+"\n"+largeDecimalNumbers+"\n"+largeInteger+"\n"+check);
    }

}
