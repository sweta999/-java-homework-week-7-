package javaprogramsweek7;

/** Write a Java program, input sales id, seller's name, sales amount and salary basic
 *  find the Sales Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 *  Sales amount >= 20,000 10%
 *  Sales amount >= 10,000 5%
 *  Sales amount < 10,000 2%
 */

import java.util.Scanner;

public class P7_SalesCommission {

    public static void main(String[] args) {

        //int salesid;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Sales id :  ");
        int salesid = scan.nextInt();

        System.out.println("Enter Seller's name : ");
        //String name1;
        String name1 = scan.next();

        System.out.println("Enter Sales amount : ");
        //double salesamount;
        double salesamount = scan.nextDouble();

        System.out.println("Enter Basic Salary : ");
        //int salary;
        int salary = scan.nextInt();

        if (salesamount >= 50000) {
            System.out.println("Sales Commission is : " + salesamount * 35 / 100);
        }
        else if (salesamount >= 30000) {
                System.out.println("Sales Commission is : " + salesamount * 20 / 100);
            }
        else if (salesamount >= 20000) {
                System.out.println("Sales Commission is : " + salesamount * 10 / 100);
            }
        else if (salesamount >= 10000) {
                System.out.println("Sales Commission is : " + salesamount * 5 / 100);
            }
        else if (salesamount < 10000) {
                System.out.println("Sales Commission is : " + salesamount * 2 / 100);
            }
        else
                System.out.println(" Thank you for the Sales ");
        }
    }














