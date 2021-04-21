package javaprogramsweek7;

/** Write a Java program to sort a numeric array and a string array.
 **/

//The java. util. Arrays. sort(Object[] a, int fromIndex, int toIndex)
//method sorts the specified range of the specified array of objects into ascending order,
//according to the natural ordering of its elements.
//The range to be sorted extends from index fromIndex, inclusive, to index toIndex, exclusive.

import java.util.Arrays;


public class P17_NumericStringArray {

    public static void main(String[] args) {
        int numarray[] = { 16,390,1042,114,276,9,22,94};

        String strarray[] = {"hi","hello","Good","Smile","happy","Best","go","Come"};

        //1.print statement to sort numeric array
        //If not specified array will be sorted in ascending order by default
        System.out.println("Original numeric array :" +Arrays.toString(numarray));
        Arrays.sort(numarray);
        System.out.println("Sorted numeric array :" +Arrays.toString(numarray));

        //2.print statement to sort string array
        //If not specified array will be sorted in ascending order by default
        System.out.println(" ");
        System.out.println("Original string array :" +Arrays.toString(strarray));
        Arrays.sort(strarray);
        System.out.println("Sorted string array :" +Arrays.toString(strarray));

        //3.print statement to sort numeric array in descending order
        //System.out.println("Original numeric array :" +Arrays.toString(numarray));
        //Arrays.reverse(numarray);
        //System.out.println("Numeric array sorted in Descending order : " +Arrays.toString(numarray));

        //4.print statement to sort numeric array in descending order
        //System.out.println("Original string array :" +Arrays.toString(strarray));
        //strarray.reverse();
        //System.out.println("Sorted string in Descending order : " +Arrays.toString(strarray));


    }

}
