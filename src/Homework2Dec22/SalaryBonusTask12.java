package Homework2Dec22;

import java.util.Scanner;

/* Write a program to ask user to enter numbers of worked years and annual salary.
If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not.
 Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
*/
public class SalaryBonusTask12 {
    public static void main(String[] args) {
        System.out.println("Please enter the no of years Worked ");
        Scanner yearsworked=new Scanner(System.in);
        int yearsWorked=yearsworked.nextInt();

        if (yearsWorked>=5){
            System.out.println("You are eligible for bonus.");
            System.out.println("Please enter your salary ");
            Scanner salaryinput=new Scanner(System.in);
            double salary=salaryinput.nextDouble();
             if (salary>50000){
                 int bonus=5000;
                 System.out.println("Your salary: "+salary+ " and bonus:"+bonus);
             }else {
                 System.out.println("Your salary:"+salary+ "and bonus:3000 ");
             }
        }else { System.out.println("You are not eligible for bonus.");}
    }




}
