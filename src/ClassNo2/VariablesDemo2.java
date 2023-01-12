package ClassNo2;

public class VariablesDemo2 {
    public static void main(String[] args) {
        int numberBox=10;// we dont need to define data type again and again java remember it
        numberBox=20;// we are reassigning number 20 to numberBox it will overwrite with 20

        System.out.println(numberBox);


        numberBox =200;// flexiblity in logic
        System.out.println(numberBox);//using same box save memory
        numberBox=30;
        System.out.println(numberBox+20);// hotel room per day e.g less work

        //loops benefits.flexibilty?

        int number=20;
        System.out.println("times 1=" + number*1);//same variable is multiple by difrrent no
        System.out.println("times 2=" +number*2);
        System.out.println("times 3="+number*3);
        System.out.println("times 4="+number*4);
        System.out.println("times 5=" + number*5);
        System.out.println("times 6="+ number*6);
        int number2=20;
        int number3=30;
        System.out.println(number*1);
        System.out.println(number2*2);//create new variable each time
        System.out.println(number3*2);// buy new car for every new thing reusing things






    }
}
