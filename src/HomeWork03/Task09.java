package HomeWork03;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        //Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
        // Based on operator provide the result to user. (edited)
        System.out.println("Please enter the first number");
        Scanner input=new Scanner(System.in);
        double number1= input.nextDouble();
        System.out.println("PLease enter operation (+,-,*,/ )");
        char operator=input.next().charAt(0);
        System.out.println("Please eneter the second number");
        double number2=input.nextDouble();
        switch (operator){
            case '+':
                System.out.println( number1+number2);
                break;
            case'-':
                System.out.println(number1-number2);
                break;
            case'*':
                System.out.println(number1*number2);
                break;
            case'/':
                System.out.println(number1/number2);
                break;
            default:
                System.out.println("Enter wrong option");

        }
    }
}
