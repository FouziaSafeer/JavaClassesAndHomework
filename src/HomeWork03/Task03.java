package HomeWork03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F*/
        System.out.println("Please enter Quiz marks");
        Scanner input = new Scanner(System.in);
        int quiz = input.nextInt();
        System.out.println("Please enter Mid Marks");
        int mid = input.nextInt();
        System.out.println("Please enter your term marks");
        int term = input.nextInt();

        int marks = (quiz + mid + term) / 3;
        if (marks >= 90) {
            System.out.println("you got A grade");
        } else if (marks >= 70 && marks < 90) {
            System.out.println("You got B grade");

        } else if (marks >= 50 && marks < 70) {
            System.out.println("You got C grade");

        } else {
            System.out.println("you got F grade");
        }

    }
}

