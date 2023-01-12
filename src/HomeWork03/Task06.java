package HomeWork03;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        //6)Write a program to find largest number among three numbers using nested if provided by a user (numbers must be distinct)
        System.out.println("Please enter first number");
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        System.out.println("Please enter second number");
        double number2 = input.nextDouble();
        System.out.println("Please enter third number");
        double number3 = input.nextDouble();
        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println("First largest no " + number1);
            } else {
                System.out.println("second is largest no " + number3);
            }
            if (number2 > number1) {
                if (number2 > number3) {
                    System.out.println("second is largest no " + number2);
                } else {
                    System.out.println("3rd is largest number " + number3);
                }
            }
        }if (number3>number1){
            if(number3>number2){
                System.out.println("3 is largest numver "+ number3);
            }else {
                System.out.println("second is largest number "+number2);
            }
        }

    }
}
