package classNo6;

import java.util.Scanner;

public class LogicalOrDemo {
    public static void main(String[] args) {

        System.out.println("Please tell today day ");
        Scanner input=new Scanner(System.in);


        String day= input.nextLine();
        if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")){
            System.out.println("No class Today");
        } else if (day.equalsIgnoreCase("Satuday")|| day.equalsIgnoreCase("Sunday")) {
            System.out.println("Java class enjoy");

        } else if (day.equalsIgnoreCase("Wednesday")|| day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Manual testing");

        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("REview class");

        }else {
            System.out.println("Wrong day");
        }
        input.close();
    }
}
