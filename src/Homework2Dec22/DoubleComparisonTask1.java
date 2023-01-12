package Homework2Dec22;

import java.util.Scanner;

//Create a Java program and name it Double Comparison. Declare 2 double values and if value of first variable
// is higher then the second, print “Double value  is larger than  .” Otherwise print...
public class DoubleComparisonTask1 {
    public static void main(String[] args) {

        System.out.println("Please enter First number");
        Scanner input=new Scanner(System.in);
        double number1 =  input.nextDouble();
        System.out.println("Please enter second number");
        Scanner input2=new Scanner(System.in);
        double number2 =  input2.nextDouble();
        //double number2 =1;
        if (number1 > number2) {
            System.out.println("Fisrt value is lar15ger than second value");
        }else {
                System.out.println("Second value is larger than first value");
            }
        }
    }

