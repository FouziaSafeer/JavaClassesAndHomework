package classNo15;

public class MPractice3 {
    public static void main(String[] args) {


    //creat a method that take an array of int and summ all the emenets in array and returns sum
    int [] array={10,12,13,14};

    ArraySum sum=new ArraySum();// creat object
        System.out.println(sum.arrSum(array));//(sum.arrSum(int arr[]={12,10,13,14})
        System.out.println(sum.arrSum(new int[]{10,20,30}));// direct creating array in metho
}}
