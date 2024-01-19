package com.aryan;

//  ANY THING THAT STARTS WITH CAPITAL LETTER IS CLASS (just representation of class)
public class _4_PrimitiveDataTypes {
        public static void main(String[] args) {

                // https://www.w3schools.com/java/java_data_types.asp

                // primitive byte data type size = 1 byte (Stores whole numbers from -128 to
                // 127)
                byte age = 21;

                // primitive short data type size = 2 byte (Stores whole numbers from -32,768 to
                // 32,767)
                short id = 20000;

                // primitive int data type size = 4 bytes (Stores whole numbers from
                // -2,147,483,648 to 2,147,483,647)
                int rollNo = 10; // by default type of number without decimal is int

                // primitve long data type size = 8 bytes (Stores whole numbers from
                // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
                long largeInteger = 65454568746L; // add L at the end of value

                // primitive char data type size = 4 bytes
                char letter = 'c';

                // primitive float data type size = 4 bytes (Stores fractional numbers.
                // Sufficient for storing 6 to 7 decimal digits)
                float marks = 98.67f; // we have to add 'f' at the end

                // primitive double data type size = 8 bytes (Stores fractional numbers.
                // Sufficient for storing 15 decimal digits)
                double largeDecimalNumbers = 45456.453; // by default value of number with decimal is double


                // primitive boolean data type
                boolean check = true;

                System.out.println(age + "\n" + id + "\n" + rollNo + "\n" + letter + "\n" + marks + "\n"
                                + largeDecimalNumbers + "\n" + largeInteger + "\n" + check);
        }

}
