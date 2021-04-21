package javaprogramsweek7;

/**
 * Write a java program that tells us that Input number is odd or even.
 */

//This will import just the Scanner class

import java.util.Scanner;

public class P1_EvenOddTernary {

    public static void main(String[] args) {

        //Instance Variable
        int number;
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

        //Final Output is stored in String Variable
        String strOutput = (number % 2 == 0) ? "even" : "odd";   //ternary method
        System.out.println(number + " is " + strOutput + " number");
        scan.close();


    }
}



