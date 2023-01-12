package HomeWork03;

public class Task10 {
    public static void main(String[] args) {
        //9) write a loop to print numbers from 1 to 100
        int number = 1;
        while (number <= 100) {
            System.out.print(number+" ");
            number++;
        }  //10) write a loop to print odd numbers from 1 to 15
        System.out.println("");
        int number2 = 1;
        while (number2 <= 15) {
            if (number2 % 2 == 1) {
                System.out.print(number2+" ");
            }
            number2++;
        } // 11)write a loop to print these number 5,10,15,20,25,30.... 50
        System.out.println(" ");
        int number3=1;
        while(number3<=50){
            if(number3%5==0){
                System.out.print(number3+" ");
            }number3++;
        }


    }
}
