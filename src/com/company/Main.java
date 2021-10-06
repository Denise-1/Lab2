// Denise Chen
// IS 146-04
// d189@umbc.edu
// date
// Use switch and If, elseif, else to print months

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // Part 1
        // use switch
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month: ");
        int monthNum = input.nextInt();

        switch (monthNum) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println ("This is not a month");

        }

    // Part 2
        // Use If, elseif,  else
        System.out.println("Enter a month: ");
        int month_Num = input.nextInt();

            if (month_Num == 1) {
                System.out.println("January");
            } else if (month_Num == 2) {
                System.out.println("February");
            } else if (month_Num == 3) {
                System.out.println("March");
            } else if (month_Num == 4) {
                System.out.println("April");
            } else if (month_Num == 5) {
                System.out.println("May");
            } else if (month_Num == 6) {
                System.out.println("June");
            } else if (month_Num == 7) {
                System.out.println("July");
            } else if (month_Num == 8) {
                System.out.println("August");
            } else if (month_Num == 9) {
                System.out.println("September");
            } else if (month_Num == 10) {
                System.out.println("October");
            } else if (month_Num == 11) {
                System.out.println("November");
            } else if (month_Num == 12) {
                System.out.println("December");
            }
            else {
                System.out.println("This is not a month");
            }


        // Rewrite the above program using if,elseif else statement.
    //Use scanner class to ask user to input number of a months between 1 and 12
    //Assign proper datatype to input
    //Print name of a month based on user input



    }
}
