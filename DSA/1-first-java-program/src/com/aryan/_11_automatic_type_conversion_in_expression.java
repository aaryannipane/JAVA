package com.aryan;

public class _11_automatic_type_conversion_in_expression {
    public static void main(String[] args) {
        System.out.println("Automatic type conversion in expression");
        int q = 257;

//      a byte datatype can store max value is 256
        byte p = (byte) (q); // 257 % 256 = 1
        System.out.println(p);
//      we had casted the int to byte than to the byte varible stores 1
//      it is because it is dividing the int variable value with 256 and remainder is stored

//      automatic promotion
        byte a = 40;
        byte b = 50;
        byte c = 100;

        int d = a * b / c;
//      a*b will be more than 256 but byte can store only 256 value
//      but the java itself automatic promote it to int and now it can store
//      more than 256 value cause it is performing valuation a*b/c

//      below code is not allowed

        byte z = 50;
//        z = z * 2;

//      it will throw error cause the valuation converts byte to int and
//      int value can't be stored in byte variable


//      type coversion with char
        int x = 'A';
        System.out.println("\n---type coversion with char---\n"+x);
        // it will return asci value of char A which is 65

//        JAVA FOLLOWS UNICODE SO IT CAN PRINT ANY LANGUAGE
        System.out.println("नमस्ते");
        System.out.println("नमस्कार");
    }
}
