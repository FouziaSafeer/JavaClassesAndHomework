package classNo9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Write a program that reads a range of integers
                (start and end point), provided by a user and then
        from that range prints the sum of the even and odd integers.

     */
    Scanner input=new Scanner(System.in);
        System.out.println("Please enter two number starting point and ending point");
        int start=input.nextInt();
        int end= input.nextInt();
        int evensum=0;
        int oddsum=0;
        System.out.println("Start "+ start+ "end "+end );
        for (int i = start; i <=end ; i++) {
                if(i%2==0){
                    evensum+=1;
                   // System.out.println("even number "+i);
                }else{
                   oddsum=oddsum+i;
                    // System.out.println("Odd number "+ i);
                }

        }
        System.out.println("Sum of all even numbers"+ evensum);
        System.out.println("Sum of all odd number"+ oddsum);

    }}

