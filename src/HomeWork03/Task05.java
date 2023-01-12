package HomeWork03;

public class Task05 {
    public static void main(String[] args) {
        //Write a program to find largest of three double values using if-else..if
        // and logical operators provided by a user (numbers must be distinct)
        double number1=972345;
        double number2=965432;
        double number3=78945;
        if(number1>number2 && number1>number3){
            System.out.println("Largest number is 1st : "+number1);
        } else if (number2>number1 && number2>number3) {
            System.out.println("Largest number is 2nd: "+number2);
        } else if (number3>number1 && number3>number2) {
            System.out.println("Largest number is 3rd: "+ number3);

        }


    }
    }

