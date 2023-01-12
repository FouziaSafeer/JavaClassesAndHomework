package Homework2Dec22;

import java.util.Scanner;

public class OddNumberTask4n5 {
    public static void main(String[] args) {
        //Write a program to check whether number is positive or negative.
          //      Interview Question
     //   Write a Java Program to check whether number is Even or Odd.
        System.out.println("Please enter no");
        double number;
        Scanner input=new Scanner(System.in);
         number = input.nextDouble();
         double evenNumber=2;
        if(number>0){
            System.out.println("the number is positive");
        }
        if(number<0){
            System.out.println("The number is Negative");
        }

        //code for Even/Odd number
         if((number%evenNumber)==0){
             System.out.println("Its Even No.");
         }else {System.out.println("Its odd No.");}











    }
}
