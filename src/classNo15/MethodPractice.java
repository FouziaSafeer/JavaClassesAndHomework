package classNo15;

public class MethodPractice {
    public static void main(String[] args) {
        //creat method return true or false and take int number as a paramether
        // if number is even it retiurns true other wise false

        int number = 45;
        //int number2=100;
        int number3=12;
        int number4=20;
        boolean anser1,anser2,anser3,anser4;
        EvenOddNumberMethod mt= new EvenOddNumberMethod();// need to learn this line here you stuck

        System.out.println(mt.evenodd(100));

        anser1 = mt.evenodd(number);
      //  anser2 = mt.evenodd(number2);
        anser3 = mt.evenodd(number3);
        anser4 = mt.evenodd(number4);



        System.out.println(anser1);
     //  System.out.println(anser2);
        System.out.println(anser3);
        System.out.println(anser4);


        /*boolean isEven1= methodpractice.isEven1(100);
        System.out.println(isEven1);
        boolean isEven2=methodpractice.isEven2(12);
        System.out.println(isEven2);
        boolean isEven3=methodpractice.isEven2(20);
        System.out.println(isEven2);
*/

    }}



