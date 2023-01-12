package ClassNo4;

public class IfElseIfConditions3 {
    public static void main(String[] args) {

        int day=8;// assign a value to a variable

        if(day==1)// we compare two values
        {
            System.out.println("Monday");// block of code
        }else if(day==2){
            System.out.println("Tuesday");// else bloak
        } else if (day==3) {
            System.out.println("Wednesday");

        }else if(day==4){
            System.out.println("Thurday");
        } else if (day==5) {
            System.out.println("Friday");

        } else if (day==6) {
            System.out.println("Saturday");

        } else if (day==7) {
            System.out.println("Sunday");

        }else{
            System.out.println("PLease enyter day betweek 1-7");
        }


    }
}
