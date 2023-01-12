package Homework2Dec22;

import java.util.Scanner;

/*
Create a Java program that will ask user to input city and temperature.
 Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
 */
public class YourCityTemoTask10 {
    public static void main(String[] args) {
        System.out.println("Please Enter your City Name");
        Scanner inputCity= new Scanner(System.in);
        String city=inputCity.nextLine();
        System.out.println("Please enter temperture in Fahrenheit");
        Scanner inputTemp=new Scanner(System.in);
        double temp=inputTemp.nextDouble();
        double tempCelsius= (temp-32)* (0.5556);
        System.out.println("The temperature of the city "+city+" is "+ tempCelsius);

    }
}
