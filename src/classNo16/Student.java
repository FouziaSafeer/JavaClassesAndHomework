package classNo16;

import java.sql.SQLOutput;

public class Student {
    String name;
    String id;
     static String schoolName;
    int age=18;
    double weigth;
    void printName(){//instance method without static method
        int SSN=13456788;
        System.out.println(name);
        System.out.println();
    }

static void printStudentInnfo(){
    //System.out.println(name); cant acess here
    System.out.println(schoolName);
}

}
