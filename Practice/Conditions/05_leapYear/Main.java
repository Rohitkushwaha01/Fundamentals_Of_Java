// if year is divided by 4, 400 or it is a century year then it's a leap year otherwise it's not a leap year.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        boolean leapYear;

        System.out.print("Enter any year: ");
        year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                } else {
                    leapYear = false;
                }
            } else {
                leapYear = false;
            }
        } else {
            leapYear = true;
        }

        if (leapYear) {
            System.out.println(year + " it's a leap year");
        } else {
            System.out.println(year + " it's not a leap year");
        }
    }
}
