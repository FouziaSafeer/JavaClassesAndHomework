package Homework1;
/*
2) Create a Java program and name it VariableValues
In your program create variables to store all different types of primitive data.
Update(reassign) value of each variable
Print the value of each variable
 */
public class Task2 {
    public static void main(String[] args) {
        byte num1 =127;//max positive no
        short num2=32767; //max positive no
        int num3=2147483647;//max positive no
        long num4=9223372036854775807l;//max positive no
        float num5= 3.40282358888888f;//max positive value  float with 10 precession
        double num6=1.7976931348623157E308d;//max value with 20 precision
        //double num7= 2035.8452504254654525d;// this number is bigger in then last one confusing ??
        char yes='Y';
        boolean no=false;
        //reassign the value of your choice
         num1 =85;
         num2=10000;
         num3=5000000;
         num4=10000000000l;
         num5= 20.54f;//
         num6=361245.785d;
        //double num7= 2035.8452504254654525d;// this number is bigger in then last one confusing ??
         yes='N';
         no=true;
        System.out.println("******************");
        System.out.println("byte = "+num1);
        System.out.println("short = "+num2);
        System.out.println("int = " +num3);
        System.out.println("Long = "+num4);
        System.out.println("float = "+num5);
        System.out.println("double= "+num6);
        //System.out.println("double testing range= "+num7);//testing
        System.out.println("char Y= "+ yes);
        System.out.println("boolean No is "+no);
        System.out.println("******************");


    }
}
