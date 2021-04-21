package javaprogramsweek7;

/**
 * Take a Input of any alphabet from "A" to "F" and print their city name accordingly(use if else)
 * if any other alphabet, message should be Invalid Entry
 */

import java.util.Scanner;

public class P8_InputCityName {

    public static void main(String[] args) {

        //print statement
        System.out.println("Enter any alphabet from A to F :  ");

        //object created
        Scanner firstletter = new Scanner(System.in);

        //Char Input to be taken from the user.
        //next() and charAt() methods are used to read a character
        char alpha = firstletter.next().charAt(0);

        //Data released as per User input by (If Else) method
        if (alpha == 'A') {
            System.out.println("UK City Name is : Aberdeen");
        } else if (alpha == 'B') {
            System.out.println("UK City Name is : Bath");
        } else if (alpha == 'C') {
            System.out.println("UK City Name is : Cambridge");
        } else if (alpha == 'D') {
            System.out.println("UK City Name is : Derby");
        } else if (alpha == 'E') {
            System.out.println("UK City Name is : Exeter");
        } else if (alpha == 'F') {
            System.out.println("UK City Name is : Falkirk");
        } else {
            System.out.println("Invalid Entry");
        }

        System.out.println("Thank you");
    }

}