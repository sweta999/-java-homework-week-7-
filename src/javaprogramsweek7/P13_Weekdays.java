package javaprogramsweek7;

/**
 * Write a Java program which input any number between 1 to 7 and
 * it print "The Days" name MONDAY, TUESDAY... SUNDAY of the week accordingly by using switch.
 * Note: if number is out of selection Print message "Week contains 1 to 7 days"
 */


import java.util.Scanner;

public class P13_Weekdays {


    public static void main(String[] args) {

        Scanner day = new Scanner(System.in);  //object created

        System.out.println("Enter any number from 1 to 7 : ");  //print statement

        int weekday;  //Instance Variable

        weekday = day.nextInt();  //Input taking from User

        switch (weekday) {
            case 1:
                System.out.println("1st Day of the Week is : Monday");
                break;
            case 2:
                System.out.println("2nd Day of the Week is : Tuesday");
                break;
            case 3:
                System.out.println("3rd Day of the Week is : Wednesday");
                break;
            case 4:
                System.out.println("4th Day of the Week is : Thursday");
                break;
            case 5:
                System.out.println("5th Day of the Week is : Friday");
                break;
            case 6:
                System.out.println("6th Day of the Week is : Saturday");
                break;
            case 7:
                System.out.println("7th Day of Week is : Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
        System.out.println("   'Smile everyday' ");
    }

}
