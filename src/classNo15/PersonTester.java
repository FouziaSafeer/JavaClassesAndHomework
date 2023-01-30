package classNo15;

import classNo16.Person;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
        //System.out.println(person.bankBalance);
       // System.out.println(person.address);
        System.out.println(person.name);
        person.printTikTokAccount();//System.out.println(person.address);
        Scanner input=new Scanner(System.in);
        input.next();
    }
}
