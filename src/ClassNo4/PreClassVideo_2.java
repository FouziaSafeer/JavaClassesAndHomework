package ClassNo4;

import java.util.Scanner;

public class PreClassVideo_2 {
    public static void main(String[] args) {
        //scanners video
        Scanner scan= new Scanner(System.in);
        System.out.println("what is your name?");

        String name= scan.next();
        System.out.println(name);
        System.out.println("Whats your age");
        int age= scan.nextInt();
        System.out.println("Your age is "+age);
        System.out.println("whats your seniour quote");
        String quote=scan.next();
        quote=quote+scan.nextLine();
        System.out.println(quote);

    }
}
