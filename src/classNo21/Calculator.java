package classNo21;

public class Calculator {
    void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    void add(int num1,double num2){//diff data type
        System.out.println(num1+num2);
    }
    void add(double num1,int num2){//diff sequence
        System.out.println(num1+num2);
    }
    void add(int num1,int num2,int num3){//diff parameters
        System.out.println(num1+num2+num3);
    }
}
