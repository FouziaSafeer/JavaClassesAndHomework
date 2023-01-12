package ClassNo4;

import java.util.Scanner;

public class ScannarDemo1 {
    public static void main(String[] args) {
            //below line helps us get the inout from keyboard
        Scanner inPut=new Scanner(System.in);
        System.out.println("Please enter you name");
        String name= inPut.nextLine();// next line is used when we need to take sences from key board
        //System.out.println("");
        System.out.println("My name is "+name);
        System.out.println("please enter your age");


    }
}
