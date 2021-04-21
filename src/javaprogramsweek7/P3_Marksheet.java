package javaprogramsweek7;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and  English marks
 * (Marks is between 0 to 100 and if it is out of range print error message “Invalid  Input, Marks should between 0 to 100”)
 * and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35)
 * and also give them grade if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C
 * And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

import java.util.Scanner;

public class P3_Marksheet {

    public static void main(String[] args) {

        Scanner sheet = new Scanner(System.in);

        System.out.print("Enter Student Name  :  ");
        String name = sheet.next();
        System.out.print("Enter Roll No  :  ");
        int rollno = sheet.nextInt();
        System.out.print("Enter Math marks  :  ");
        int math = sheet.nextInt();
        if (math < 0) {
            System.out.println("Invalid input, marks between 0 to 100");
        } else if (math > 100) {
            System.out.println("Invalid input, marks between 0 to 100");
        }
        System.out.print("Enter Science marks  :  ");
        int science = sheet.nextInt();
        if (science < 0) {
            System.out.println("Invalid input, marks between 0 to 100");
        } else if (science > 100) {
            System.out.println("Invalid input, marks between 0 to 100");
        }
        System.out.print("Enter English marks  :  ");
        int english = sheet.nextInt();
        if (english < 0) {
            System.out.println("Invalid input, marks between 0 to 100");
        } else if (english > 100) {
            System.out.println("Invalid input, marks between 0 to 100");
        }

        int total = (math + science + english);
        double  percentage = (total * 100 / 300);

        String grade = " ";
        if (percentage >= 80) {
            //System.out.println("A+");
            grade = "A+";
        } else if (percentage >= 60) {
            //System.out.println("A");
            grade = "A";
        } else if (percentage >= 50) {
            //System.out.println("B");
            grade = "B";
        } else if (percentage >= 35) {
            //System.out.println("C");
            grade = "C";
        }
        //int result = 0;
        String rs = " ";
            if (percentage >= 35) {
               // System.out.println("Fail");
                rs = "PASS";
            } else {
                //System.out.println("Pass");
                rs = "FAIL";
            }


        System.out.println("----------------------------------------");
        System.out.println("|                                      |");
        System.out.println("| Mark Sheet                           |");
        System.out.println("|                                      |");
        System.out.println("|Name :           "+name+"             |");
        System.out.println("|Roll No :        "+rollno+"           |");
        System.out.println("|______________________________________|");
        System.out.println("|Subjects :         Marks              |");
        System.out.println("|Maths  :         "+math +"            |");
        System.out.println("|Science  :       "+science +"         |");
        System.out.println("|English  :       "+english +"         |");
        System.out.println("|______________________________________|");
        System.out.println("|Total    :       "+total +"           |");
        System.out.println("|______________________________________|");
        System.out.println("|Percentage :     "+percentage +"      |");
        System.out.println("|Result :         " +rs +"       |");
        System.out.println("|Grade :          " + grade + "      |");
        System.out.println("|______________________________________|");
}

}








