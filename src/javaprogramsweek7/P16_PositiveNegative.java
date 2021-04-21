package javaprogramsweek7;

/** Write the java program to check if enter number is "POSITIVE", "NEGATIVE" OR "ZERO"
 *
 */

import java.util.Scanner;

public class P16_PositiveNegative {

    public static void main(String[] args) {
        Scanner num = new Scanner(System .in);
        System.out.println("Enter any number : ");
        double number;
        number = num.nextDouble();

        if (number > 0){
            System.out.println(number + " is Positive number.");
        }
        else if (number < 0) {
            System.out.println(number + " is Negative number.");
        }
        else {
            System.out.println(number + " is Zero. ");
        }
            System.out.println("   Keep Practicing");

    }


}
