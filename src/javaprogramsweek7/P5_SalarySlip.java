package javaprogramsweek7;

/**
 * Write a Program to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 *_______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | DA 8% : 2250.0 |
 * | TA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 *
 */

import java.util.Scanner;

public class P5_SalarySlip {

    public static void main(String[] args) {

        //int employeeid;
        Scanner slip = new Scanner(System.in);
        System.out.println("Enter Employee ID  :  ");
        int employeeid = slip.nextInt();

        //String name;
        System.out.println("Enter Name : ");
        String name = slip.next();

        //double basicsalary;
        System.out.println("Enter Basic Salary : ");
        double basicsalary = slip.nextDouble();

        double hra = (basicsalary * 10/100);
        double da = (basicsalary * 8/100);
        double ta = (basicsalary * 9/100);
        double pf = (basicsalary * 20/100);
        double grosssalary = (basicsalary + hra + da + ta - pf );

        System.out.println("--------------------------------");
        System.out.println("|Salary Slip                   |");
        System.out.println("|______________________________|");
        System.out.println("|Employee Id   :"+employeeid+ "|");
        System.out.println("|Employee Name :"+name+"       |");
        System.out.println("|                              |");
        System.out.println("|Basic Salary : "+basicsalary+"|");
        System.out.println("|HRA 10%      : "+hra+"        |");
        System.out.println("|DA 8%        : "+da+"         |");
        System.out.println("|TA 9%        : "+ta+"         |");
        System.out.println("|PF -20%      : " +pf+"        |");
        System.out.println("|------------------------------|");
        System.out.println("|Gross Salary : "+grosssalary+"|");
        System.out.println("|------------------------------|");


    }
}