package javaprogramsweek7;

/**
 * Write a program that tells us input value is number or an alphabet or symbol by using ASC|| method.
 * Stands for "American Standard Code for Information Interchange.
 * ASCII is a character encoding that uses numeric codes to represent characters.
 * These include upper and lowercase English letters, numbers, and punctuation symbols.
 */

import java.util.Scanner;

public class P12_InputValue {

    public static void main(String[] args) {

        //obj created
        Scanner ch = new Scanner(System.in);
        //print statement
        System.out.print("\nEnter any character : ");
        //Input taking from User
        char input = ch.next().charAt(0);

        // (If Elseif Else loop with ASCII method)
        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z'))
        {
            System.out.println("\n" + input + " is an Alphabet ");
        }
        else if
            (input >= '0' && input <= '9') {
            System.out.println("\n" + input + " is a Number. ");
        }
        else
        {
            System.out.println("\n" + input + " is a Symbol. ");
        }


    }


}




