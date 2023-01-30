package ClassNo12;

import java.sql.SQLOutput;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        //Store username, password and confirm password from a user and check following requirements:
        //
        //Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        //Password should be minimum 8 characters, if less → message=”Password is too short”.
        //Password cannot contain username if so, → message=”Password cannot contain username”.
        //Password should match confirmed password, if not  → message=“Passwords do not match”.
        //
        //Only after all requirements met → message “Your username and password has been created”
        String userName="Fouzia";
        String password="Password";
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter user name");
        String userNameInput=input.nextLine();
        System.out.println("Enter Password");
        String passwordInput=input.nextLine();

        if( passwordInput.isEmpty()&& userNameInput.isEmpty()){
            System.out.println("Username and Password cannot be empty");
        }if(passwordInput.contains(userNameInput)){
            System.out.println("”Password cannot contain username”");
        }
        if(userName.equals(userNameInput)&&(!password.equals(passwordInput))){
            System.out.println("Password incorrect");}

        if(userName.equals(userNameInput)&&(password.equals(passwordInput))){
            System.out.println("Login sucessfully");
        }

}}
