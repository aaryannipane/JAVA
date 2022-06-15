package code;

// QUESTION :- find numbers with even number of digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// ex {12, 3, 3456, 23}
// 3 numbers are even no of digits

public class leetcode_1295 {
    public static void main(String[] args) {
        int[] nums = {12, 0, -3456, 23};

        System.out.println(findeEvenNumbers(nums));
    }

    static int findeEvenNumbers(int[] nums){
        int count = 0;

        for(int num : nums){
            if(even(num))
                count++;
        }

        return count;
    }

    static boolean even(int num){

        // if number is negative make it positive
        if(num < 0)
            num = num * -1;

//        logical method to get number of digits
        int len = 0;

//        if(num != 0){
//            while(num > 0){
//                len++;
//                num = num/10;
//            }
//        }
//        else
////            when num == 0 digits are 1
//            len = 1;


//        easy way to find number of digits
        len = (int)(Math.log10(num))+1;

        return len % 2 == 0;
    }
}





