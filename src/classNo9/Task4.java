package classNo9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        //step no 1 ask user for item price and item name
        //step no 2 accumulate the price
        //step no 3 tell user how much total should pay
        //step no 4 return change
        //step no 5 thankyou
        Scanner input = new Scanner(System.in);
        double total=0;
        for (int i = 0; i < 3; i++) {

           System.out.println("PLEASE enter item and its price");
           String itemName = input.next();
           double itemPrice = input.nextDouble();
            total=total+itemPrice;
            System.out.println("this is the total amount to pay"+ total);
       }
        System.out.println("Please pay for the items");
        double amountpaid=input.nextDouble();
        if(amountpaid>total){
            double change=amountpaid-total;
            System.out.println("here is your chnage"+ change);
        } else if (amountpaid<total) {

            System.out.println("you need to Pay more ");

        }
        System.out.println("Thank you for shopping");









      /*  Write a program to ask a user to enter item they want to buy and the price of that item.
        Every time user enters money accumulate the amount and tell the user how much is left to pay off.
         If user give more money program should return a change.
         Whenever a user done with payments program should say "Thank you for shopping!"
                */
        /*Scanner input=new Scanner(System.in);
        String item;
        float total=0;

            System.out.println("Please enter the item to buy");
            item = input.nextLine();
            System.out.println("Please enter the Price of item");
            float price = input.nextFloat();


                total+=price;
                
                if(price>total){
                    System.out.println("Please pay "+(price-total));
                }
                if(price==total){
                    System.out.println("Please paid total amount"+total);
                }
*/
    }
}
