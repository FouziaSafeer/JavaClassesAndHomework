package Homework2Dec22;

import java.util.Scanner;

/*
You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver licence to them, otherwise you will offer them to get a learners permit.
 */
public class DrivingPermitTask9 {
    public static void main(String[] args) {
        System.out.println("Your age Please!");

        Scanner ageinput = new Scanner(System.in);
        int age = ageinput.nextInt();
        if (age>=18){
            System.out.println("Licence Issued");
        }
        else
        {
            System.out.println("Learner Permit Issue");
        }

    }
}
