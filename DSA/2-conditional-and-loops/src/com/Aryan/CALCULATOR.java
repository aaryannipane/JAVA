package com.Aryan;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class CALCULATOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from user till user does not press X or x

        // infinite loop till user press x or X
        while(true){
            // take operator as input
            System.out.println("Enter the operator (+, -, *, /, %) or 'x' to exit:- ");
            char op = in.next().trim().charAt(0);
            // check operator input is correct or not
            if(op == '+' || op == '-' || op == '/' || op == '*' || op == '%'){
                // input two operand or numbers
                System.out.println("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                int ans;

                if(op == '+'){
                    ans = num1 + num2;
                    System.out.println(ans);
                }
                if(op == '-'){
                    ans = num1 - num2;;
                    System.out.println(ans);
                }
                if(op == '/'){
                    if(num2 != 0) {
                        ans = num1 / num2;;
                        System.out.println(ans);
                    }
                }
                if(op == '*'){
                    ans = num1 * num2;;
                    System.out.println(ans);
                }
                if(op == '%'){
                    ans = num1 % num2;;
                    System.out.println(ans);
                }
            }else if(op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Invalid operation! Try again");
            }
        }

    }
}
