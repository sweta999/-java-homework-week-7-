package javaprogramsweek7;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+,-,*,/)
 * find addition,subtraction, multiplication and division according to their symbol (using if else)
 */

import java.util.Scanner;

public class P10_Operations {

    //Main method
    public static void main(String[] args) {


        double num1; //Instance Variable 1
        double num2; //Instance Variable 2
        char operator; //stores the operation  sign

        Scanner first = new Scanner(System.in);
        System.out.println("Enter first number :  ");
        num1 = first.nextInt();
        System.out.println("Enter second number :  ");
        num2 = first.nextInt();
        System.out.println("Enter any one arithmatic operator + , -, *, / : ");
        operator = first.next().charAt(0);


        //Data released as per User input by (If Else) method
        if (operator == '+') {
            System.out.println(num1 + " + " + num2 + " is  = " + (num1 + num2));
        }
        else if (operator == '-') {
            System.out.println(num1 + " - " + num2 + " is = " + (num1 - num2));
        }
        else if (operator == '*') {
            System.out.println(num1 + " * " + num2 + " is = " + (num1 * num2));
        }
        else if (operator == '/') {
            System.out.println(num1 + " / " + num2 + " is = " + (num1 / num2));
        }
        else {
            System.out.println("It is not a valid symbol");
            System.out.println("Please try again");

        }

    }

}

