package classNo5;

import java.util.Scanner;

public class SwitchCaseDEmo5 {
    public static void main(String[] args) {




        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender F/M");
        char gender=scanner.next().charAt(0);
        switch (gender){
            case'f':// no break so will print female
            case'F':
                System.out.println("Female");
                break;
            case 'm':
            case 'M':
                System.out.println( "Males");
                break;
            default:
                System.out.println("Not spcified");





        }


    }
}
