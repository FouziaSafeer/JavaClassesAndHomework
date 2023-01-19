package homeWorkNestedLoop;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        // Write a program that reads a range of integers (start and end point),
        // provided by a user and then from that range prints the sum of the even and odd integers.
        System.out.println("Please enter starting integer");
        Scanner input = new Scanner(System.in);
        int startingNumber = input.nextInt();
        int endingNumber = input.nextInt();
        //even no case
        int evenNumers = 0;
        // int oddNumers=0;
        int Totaleven = 0;
        for (int i = startingNumber; i <endingNumber ; i++) {
            for (int j = startingNumber; j <=endingNumber ; j++) {
               if( j%2==0) {
                   j = +j;
                  Totaleven=j;

               }
                }
            System.out.print(Totaleven+" ");
        }}}


