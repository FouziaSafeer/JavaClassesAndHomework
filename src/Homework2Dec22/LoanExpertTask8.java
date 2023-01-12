package Homework2Dec22;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
You are a loan specialist and you need to ask user what is the amount of loan is needed.
If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
 */
public class LoanExpertTask8 {
    public static void main(String[] args) {
        double loanAmount;
        System.out.println("What is the amount of loan is needed?");
        Scanner inputAmount=new Scanner(System.in);
        loanAmount=inputAmount.nextDouble();
        if(loanAmount<=200000){
            System.out.println("Will accept your claim");
        }else {
            System.out.println("Will not accept your claim");
        }
    }
}
