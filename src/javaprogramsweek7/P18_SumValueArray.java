package javaprogramsweek7;

/** Write a Java program to sum values of array.
 */

import java.util.Scanner;

public class P18_SumValueArray {

  /* public static void main(String[] args) {
        int a[] = {10, 5, 4, 8, 19};
        int sum = 0;
        for (int num : a) {
            sum = sum + num;
        }
        System.out.println("Sum of array elements is : "+sum);
    }
}*/

    public static void main(String[] args) {
        // public void sumofarrays(){

        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];    //why to write new int[] only here
        int sum = 0;
        System.out.println("Enter the elements : ");
        for (int i=0; i<5; i++) {
            a[i] = sc.nextInt();
        }
        for (int num : a){
            sum = sum + num;
        }
        System.out.println("Sum of array elements is : " + sum);

    }
    }