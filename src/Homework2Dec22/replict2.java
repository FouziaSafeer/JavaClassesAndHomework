package Homework2Dec22;

import java.util.Scanner;

public class replict2 {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner numberinput = new Scanner(System.in);
        int number = numberinput.nextInt();
        if (number % 2 == 0) {
            System.out.println("Value is even");
            {
                if (number > 1000) {
                    System.out.println("Even number is large");
                } else if(number<1000) {
                        System.out.println("Even value is just right");
                     }
                                    }

            }

        else if(number%2!=0){
            System.out.println("Value is odd");
                if (number > 1000) {
                    System.out.println("Odd number is large");
                } else {
                        System.out.println("Odd value is just right");
                    }



    }
}}









