package HomeWork03;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {



        System.out.println("Please enter you height in inches");
        Scanner input = new  Scanner(System.in);
        double height = input.nextDouble();
        if (height < 60) {
            System.out.println("short");
        } else if (height <= 60 || height <= 72) {
            System.out.println("medium");
        } else if (height > 72) {
            System.out.println("tall");

        }
input.close();

    }
}


