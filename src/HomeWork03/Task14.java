package HomeWork03;

public class Task14 {
    public static void main(String[] args) {
       // Print odd numbers between 20 and 50 (2 ways)
        int number1=21;
        while(number1<=50){
            System.out.print(number1+" " );
            number1+=2;
        }
        System.out.println("");
        System.out.println("*********************************");

        int number2=20;
        while(number2<=50){
            if(number2%2==1)
                System.out.print(number2+" ");
                number2++;
            }
        }

    }

