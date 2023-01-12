package HomeWork03;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
2) Write a program that will print whether it is a weekend or weekday.
If any day from 1-5 → output “It is a weekday”,
anyday from 6-7 → output “It is a weekend”,
 any other day → output “Invalid day” (edited)
  */
        System.out.println("Please enter day number from 1-7");
        Scanner input = new Scanner(System.in);
        int dayNumber = input.nextInt();
        if (dayNumber == 1 || dayNumber == 2 || dayNumber == 3 | dayNumber == 4 || dayNumber == 5) {
            System.out.println("It is a weekday");
        } else if (dayNumber == 6 || dayNumber == 7) {
            System.out.println("It is a weekend");

        }
       else{ System.out.println("Invalid day");}
    }

    }



