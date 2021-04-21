package javaprogramsweek7;

/**
 * Write a Java program to calculate the average value of array elements.
 */

/*public class ArrayAverageValue_P19 {

       public static void main(String[] args) {
        double[] arr = {10, 12, 15, 17, 16.5, 11};
        double total = 0;

        for (int i = 0; i<arr.length; i++) {
            total = total + arr[i];
        }

        /* arr.length returns the number of elements
         * present in the array
         */

        //double average=total/arr.length;

        /* This is used for displaying the formatted output
         * if you give %.3f then the output would have 4 digits
         * after the decimal point.
         */
        //System.out.format("The average is: %.3f",average);   //why???? format instead of println
        //}
        //}

import java.util.Scanner;

public class P19_ArrayAverageValue {
    public static void main(String[] args) {
        System.out.println("How many numbers you want to enter?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Declaring array of n elements, the value of n is provided by the user
        double[] arr = new double[n];
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Element No. " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.format("The average is : %.3f", average);

    }

}