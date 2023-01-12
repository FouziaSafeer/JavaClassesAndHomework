package Homework2Dec22;
// Create a Java program and store values of mortgage rate and mortgage price.
// First, program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying.
// Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
import java.util.Scanner;

public class MorgageTask7 {
    public static void main(String[] args) {


        double mortgageRate ;
        double mortgagePrice ;
        System.out.println("Please Enter Mortgage Rate");
        Scanner inputRate= new Scanner(System.in);
        mortgageRate = inputRate.nextDouble ();
        System.out.println("Please Enter Mortgage Price");
        Scanner mortgagePriceinput=new Scanner(System.in);
        mortgagePrice =mortgagePriceinput.nextDouble();

        if (mortgageRate > 4.5) {
            System.out.println("User is not buying due to high rate of morage");
        }else {
            if (mortgagePrice>200000){
                System.out.println("User will take loan as Price is greater then 200000");
            }
            else {
                System.out.println("User will pay by cash");
            }

        }



        }
    }

