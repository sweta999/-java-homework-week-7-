package javaprogramsweek7;

import java.util.Scanner;

public class P6_OddOREven {

    public static void main(String[] args) {

        //The input provided by user is stored in Variable num
        int num;
        System.out.println("Enter an Integer number : ");

        Scanner input = new Scanner(System.in);
        /* input is an object of the Scanner Class
         *System.in within round brackets tell Java that this will be system Input.
         * i.e input from a user will be given to the system */

        num = input.nextInt();
        /* nextInt() is used to input an integer value from the user and assign it to the variable num
         * Here, nextInt() is a method of the object input of the Scanner class.
         */

        /* If number is divisible by 2 then it is an even number
         * else odd number */

        if (num % 2 == 0) {
            System.out.println("Entered number is even");
        } else {
            System.out.println("Entered number is odd");
        }

    }

}




