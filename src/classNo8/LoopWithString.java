package classNo8;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner input=new Scanner(System.in);
        while(input.next().equalsIgnoreCase("fizzy")){
            System.out.println("very nice student");
        }
    }
}
