package javaprogramsweek7;

/**
 * Write a Java program to input any year and find out if it is leap year or not?
 */

import java.util.Scanner;

public class P2_leapyear {

    //Main method
    public static void main(String[] args) {

        //Instance Variable
        int year;
        System.out.println("Enter any year : ");

        //Object created
        Scanner obj = new Scanner(System.in);
        year = obj.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("This year is a leap year");
                } else {
                    System.out.println("This is not a leap year");
                }
            }

        }

    }
}
