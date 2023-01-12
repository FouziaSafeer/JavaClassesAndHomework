package Homework2Dec22;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GPA__Task6 {
    public static void main(String[] args) {
        /*
        Write a program to store a boolean value of whether user has diploma or not.
         If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree.
         Then if user has a degree program should check a gpa score.
         If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”,
         otherwise → “You should have studied harder”
         */

        boolean degreeHolder = true;
        if (degreeHolder) {
            System.out.println("Congratulations!!");
            System.out.println("Please enter Your GPA");
            float gpa;
            Scanner input = new Scanner(System.in);
            gpa = input.nextFloat();
            if (gpa >= 3.5) {
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You should have studied harder");
            }
        } else {
            System.out.println("Get a degree");
        }

    }
}