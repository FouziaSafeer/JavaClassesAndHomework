package classNo07;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        boolean condition=true;
        Scanner input =new Scanner(System.in);
       int number=15;
        while(condition){
            System.out.println("Please enter number between 10 to 20");
            int usernum=input.nextInt();
            if(usernum>number){
                System.out.println("you enter number is greater");
            }else if(usernum<number){
                System.out.println("You enter small numer");
            }else{
                System.out.println("you won!!!!");
                condition=false;
            }
        }
    }
}
