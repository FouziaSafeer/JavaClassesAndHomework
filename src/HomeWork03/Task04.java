package HomeWork03;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*4)Write a program for user to enter his/hers birth month. Based on the month define the season.
    Example: if user is born in June, July or August → season =”Summer”.
    At the end of the program we should see output as “You were born __”.
   */
        System.out.println("Please enter the month when you are born ?");
        Scanner input=new Scanner(System.in);
        String month=input.next();
        month=month.toLowerCase();
        if(month.equals("January")||month.equals("february")||month.equals("march")){
            System.out.println("You are born in winter");
        } else if (month.equals("april")||month.equals("may")||month.equals("june")) {
            System.out.println("You are born in Spring");
        } else if (month.equals("july")|| month.equals("august")||month.equals("september")) {
            System.out.println("You are in summer");
        } else if (month.equals("october")||month.equals("november")||month.equals("december")) {
            System.out.println("you are born in autum");
        }else{
            System.out.println("wrong month");
        }
        input.close();
    }
}
