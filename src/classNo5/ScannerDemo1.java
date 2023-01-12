package classNo5;

import java.util.Scanner;

public class ScannerDemo1 {

    public static void main(String[] args) {

    Scanner input =new Scanner(System.in);

// scanner name of class
        //input is like variable
        //==assign
        // new scanner is object
        // system.in read data from keyboard
      /*  System.out.println("please enter your age");
        int age=input.nextInt();
        System.out.println("you are "+ age+ " year old");
        System.out.println("Please enter your weight");
        double weight=input.nextDouble();
        System.out.println("Your weight is "+ weight+" kg");
        System.out.println("Are you hungry");
        boolean hungry= input.nextBoolean();
        System.out.println("hungry  "+ hungry);
        */

        // for char input
       // System.out.println("Please enter your gender");
        //char gender=input.next().charAt(0);
        //System.out.println("Your gender is " +gender);


       System.out.println("Pleaase enter your name");
        String name= input.next();// when we have to take one word
        System.out.println("Your name is "+ name);
        input.nextLine();// trick to make nextline method work after we have used any othere methof from scanner class
        System.out.println("Please enter your full name");
        String fulname=input.nextLine();
        System.out.println("Your full name is "+ fulname);
        input.close();







    }
}
