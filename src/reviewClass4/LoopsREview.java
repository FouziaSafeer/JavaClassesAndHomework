package reviewClass4;

import java.util.Scanner;

public class LoopsREview {
    public static void main(String[] args) {
        int  i =1;
        while (i<5){
            System.out.println("I am in loop ");
            i++;
        }

        int b=3;
            do{

                System.out.println(" hello");
b++;

            }while(b<5);



            Scanner input=new Scanner(System.in);
String answer;
do {
    System.out.println("Do you understand loops?");
     answer = input.nextLine();
}while(!answer.equalsIgnoreCase("yes"));
        System.out.println("great lets learn arrays now");

        }


    }
