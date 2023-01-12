package HomeWork03;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //Ask user to enter their country and capture it. Once values are captured print which language user speaks.
        System.out.println("Please enter your country name ?");
        Scanner input=new Scanner(System.in);
        String country=input.next();
        switch (country.toLowerCase()){
            case "usa":
                System.out.println("english");
                break;
            case "uk":
                System.out.println("british english");
                break;
            case "pakistan":
                System.out.println("urdu");
                break;
            default:
                System.out.println("invalid country");

    }}
}
