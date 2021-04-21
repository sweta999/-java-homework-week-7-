package javaprogramsweek7;

/**
 * Take a Input of any alphabet from "A" to "F" and print their city name accordingly
 * Use Switch statement. If any other alphabet, message should show Invalid Entry
 */

import java.util.Scanner;

public class P9_SwitchCityName {

    //Main method
    public static void main(String[] args) {

        //print statement
        System.out.println("India City Names");
        System.out.println("Enter any alphabet between from A to F : ");

        //object created
        Scanner firstletter = new Scanner(System.in);

        //Char Input top be taken from the user.
        //next() and charAt() methods are used to read a character
        char alpha = firstletter.next().charAt(0);

        //Data released as per User input by Switch method
        switch (alpha) {
            case 'A': //label
                System.out.println("Ahmedabad");
                break;
            case 'B': //label
                System.out.println("Baroda");
                break;
            case 'C': //label
                System.out.println("Chennai");
                break;
            case 'D': //label
                System.out.println("Delhi");
                break;
            case 'E': //label
                System.out.println("Ernakulam");
                break;
            case 'F': //label
                System.out.println("Faridabad");
                break;

            default:
                System.out.println("Invalid Entry");

        }
        System.out.println("Thank you");

    }

}