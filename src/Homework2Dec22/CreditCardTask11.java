package Homework2Dec22;

import java.util.Scanner;

/*Create a Java program that will ask if user has a credit card or not. If you user does not have a credit card then offer them.
If they do have one ask what is balance on the card? If balance of the card is larger than 1000, tell them to pay off immediately,
 otherwise you can tell them that they can spend more.
 */
public class CreditCardTask11 {
    public static void main(String[] args) {
        System.out.println("Do you have Credit card True or false");
        Scanner answerinput =new Scanner(System.in);
        boolean anser=answerinput.nextBoolean();

        if (anser)
        {
            System.out.println("what the balance on card?");
            Scanner amonut=new Scanner(System.in);
            double amountBalance=amonut.nextDouble();
             if(amountBalance>1000){
                 System.out.println("PLease Pay off immediately");
             } else  {
                 System.out.println("You can spend more");

             }

        } else
            System.out.println("Do need a credit card");

        }

    }

