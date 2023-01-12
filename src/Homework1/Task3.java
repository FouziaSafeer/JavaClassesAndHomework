package Homework1;
/*
3) Create a Java program and name it Variables
In your program create different type of variables to store student’s information and then print value of those variables:
name
lastName
grade
city
state
phoneNumber
b)   Change student’s city, state, phone number and grade. And print those updated values.
 */
public class Task3 {
    public static void main(String[] args) {
        String name= "Fouzia";
        String lastName= "Safeer";
        char grade='A';
        String city="Birmingham";
        String state="West Midlands";
        String mobNo="0044123456789";
        System.out.println("1. Name= "+name);
        System.out.println("2.LastName = "+lastName);
        System.out.println("3.Grade = "+grade);
        System.out.println("4.City = "+city);
        System.out.println("5.State ="+state);
        System.out.println("6.Phone No ="+mobNo);
        // update or change record city.state phone no and grade
        city= "Manchester";
        state= "North West";
        mobNo="0044987654321";
        grade ='B';
        System.out.println("********Updated Record********");

        System.out.println("1. Name= "+name);
        System.out.println("2.LastName = "+lastName);
        System.out.println("3.Grade = "+grade);//updated record should be displayed
        System.out.println("4.City = "+city);//updated record should be displayed
        System.out.println("5.State ="+state);//updated record should be displayed
        System.out.println("6.Phone No ="+mobNo);//updated record should be displayed
    }
}
