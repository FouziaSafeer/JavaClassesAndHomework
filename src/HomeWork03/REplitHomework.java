package HomeWork03;

import java.util.Scanner;

public class REplitHomework {
    public static void main(String[] args) {
        //public static void main(String [] args){
/*
            System.out.println("Do you need a loan?");
            Scanner input=new  Scanner(System.in);
            Boolean Question=input.nextBoolean();
            String eligibility="";
            if (Question){
                System.out.println("What is your credit score?");
                int score=input.nextInt();
                if(score<600){
                    eligibility ="Not eligible";
                }else if(score>=600&& score <=700){
                    eligibility= "Maybe eligible";
                }else if (score >= 701&& score <=800){
                    eligibility ="Eligible";
                }else if (score>800){
                    eligibility="Definitely eligible";
                }

                System.out.println("The eligibility is "+ eligibility);
            }*/
        System.out.println("Please enter two strings");
        Scanner input=new Scanner(System.in);
        String word1=input.nextLine();
        System.out.println("Please enter second strings");
        String word2=input.nextLine();
        System.out.println("Please enter two numbers");
        int number1=input.nextInt();
        System.out.println("Please enter 2nd numbers");
        int number2=input.nextInt();
        if(number1==number2&&word1.equalsIgnoreCase(word2)){
            System.out.println("AND");
        }
        else if((number1==number2)||word1.equals(word2)){
            System.out.println("OR");
        }else if ((number1!=number2)&&!(word1.equals(word2))){
            System.out.println("None");
        }






        }
    }
