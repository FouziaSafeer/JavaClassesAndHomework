package classNo11;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {

        //Creating an actual object from the class SCanner
       // Scanner scanner=new Scanner(System.in);
       // scanner.next();
        //this is how we create objects of a class
        //both in same package so we are not importing
        Dog dog1=new Dog();// classname objectname= new classname9()

        //call behaviour
        dog1.bark();
        dog1.sleep();
        dog1.eat();
      //  System.out.println("hello");


    }
}
