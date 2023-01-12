package Homework2Dec22;
import java.util.Scanner;
public class replit {

    public static void main(String[] args)

    {
        //public static void main(String[]args){

            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter your name");

            String userName = myObj.nextLine();
            System.out.println("Enter your mobile number");

            int myNumber = myObj.nextInt();
            System.out.println("Enter your age");

            int myAge = myObj.nextInt();

            System.out.println("Your name is "+ userName + ", your age is " + myAge + " and your mobile number is "+ myNumber);

        }


    }

