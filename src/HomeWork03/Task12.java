package HomeWork03;

public class Task12 {
    public static void main(String[] args) {
        //Print numbers from 1 to 100 in 1 line with space
        int number1 = 1;
        while (number1 <= 100) {
            System.out.print(number1 + " ");
            number1++;
        }
        //Print numbers from 100 to 1
        System.out.println("");
        int number2 = 100;
        while (1 <= number2) {
            System.out.print(number2 +" ");
            number2--;
        }
    }
}
