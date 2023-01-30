package ClassNo12;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Store username, password and confirm password from a user and check following requirements:
        //
        //Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        //Password should be minimum 8 characters, if less → message=”Password is too short”.
        //Password cannot contain username if so, → message=”Password cannot contain username”.
        //Password should match confirmed password, if not  → message=“Passwords do not match”.
        //
        //Only after all requirements met → message “Your username and password has been created”
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter your user Name");
        String userName=input.next();
        System.out.println("Please Enter your Password");
        String password=input.next();
        System.out.println("Please enter your password again");
        String confirmPassword=input.next();
        if(userName.isEmpty()||password.isEmpty()){
            System.out.println("username or password cannot be epmty");

        } else if (password.length()<8) {
            System.out.println("Password is too short mini 8char required");
            
        } else if (password.contains(userName)) {
            System.out.println("Password cannot contains username");
            
        } else if (password.equals(confirmPassword)) {
            System.out.println("Password do not match");
            
        }
        else{
            System.out.println("your user name and password has been created" );
        }

    }
}
