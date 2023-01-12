package HomeWork03;

public class Task13 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)
        //Print odd numbers between 20 and 50 (2 ways)
        int number1=20;
        while(number1>=1){
            if(number1%2==0){
            System.out.print(number1+" ");}
            number1--;
        }
        System.out.println("");
         int number2=20;
        while(number2>=1) {
            System.out.print(number2+" ");
           number2-=2;
           /* number2 --;
            number2--;*/
        }


    }

}
