package javaprogramsweek7;

/** Write a Java program to print the numbers between 1 to 100,
 * which can be divided by 3 and 5 separately
 */

public class P11_Division1to100 {

    public static void main(String[] args) {

        System.out.println("Divided by 3 : ");
        //++i(Pre Increment) means value of i is incremented before the current expression is evaluated
        //i++(Post Increment) means we are using current value of i and then incrementing the value of i
        for (int i=1;  i<=100; i++) {
            if (i % 3 == 0)
            System.out.print(i + ",");
        }
        // \n is used to print the output in the next line of console
        System.out.println("\n\nDivided by 5 : ");
        for (int i=1;  i<=100; i++) {
            if (i % 5 == 0)
            System.out.print(i + ",");
        }
        // \n is used to print the output in the next line of console
        System.out.println("\n\nDivided by 3 and 5 : ");
        for (int i=1;  i<=100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
            System.out.print(i + ",");
        }
        System.out.println("");

    }

}