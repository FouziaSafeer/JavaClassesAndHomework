package Homework2Dec22;

import java.util.Scanner;

public class MonthTask3 {
    //Create a Java program and declare int variable that will hold a month.
 //   Based on the value of the variable your program should print the name of the month.
    public static void main(String[] args) {
        int monthNumber;
        System.out.println("Please choose month number 1--12");
        Scanner input= new Scanner(System.in);
        monthNumber=input.nextInt();
        if(monthNumber==1){
            System.out.println("1.January");
        } else if (monthNumber==2) {
            System.out.println("2.February");
        } else if (monthNumber==3) {
            System.out.println("3. March");
        } else if (monthNumber==4) {
            System.out.println("4. April");
        } else if (monthNumber==5) {
            System.out.println("5. May");
        } else if (monthNumber==6) {
            System.out.println("6. June");
        } else if (monthNumber==7) {
            System.out.println("7.July");
        } else if (monthNumber==8) {
            System.out.println("8. August");
        }else if(monthNumber==9){
            System.out.println("9.September");
        }else if(monthNumber==10){
            System.out.println("10.October");
        }else if(monthNumber==11){
            System.out.println("11. November");
        } else if (monthNumber==12) {
            System.out.println("December");
        }
    else {
            System.out.println("Invalid number Please try again ");
        }
    }
}
