package classNo10;

import java.util.Arrays;
import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int[] numbers =new int[5];
       /* numbers[0]=70
        numbers[1]=50;
        numbers[2]=70;
        numbers[3]=60;
        numbers[4]=80;*/

        // below take number from user and store in array its food
        /*numbers[0]=input.nextInt();
        numbers[1]=input.nextInt();
        numbers[2]=input.nextInt();
        numbers[3]=input.nextInt();
        numbers[4]=input.nextInt();*/

      //  below code uses a normal loop to ASk the user for number and store
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=input.nextInt();

        }



        System.out.println(Arrays.toString(numbers));
    }
}
