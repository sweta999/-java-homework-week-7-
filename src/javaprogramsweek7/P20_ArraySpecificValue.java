package javaprogramsweek7;

/**
 * Write a Java program to test if an array contains a specific value.
 */

public class P20_ArraySpecificValue {

    public static boolean contains(int[] arr, int item) {

        //The colon is a shortcut for iterating over a collection.
        //The variable on the left of the colon is a temporary variable containing a single element
        //from the collection on the right.
        // With each iteration through the loop, Java pulls the next element from the collection and
        // assigns it to the temp variable.
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = {200, 180, 550, 890, 1024, 75, 6754, 23};
        System.out.println(contains(num, 6754));
        System.out.println(contains(num, 100));

    }
}