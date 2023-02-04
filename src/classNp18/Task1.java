package classNp18;//replits

import java.util.Scanner;

public class Task1 {//) Write a java class that have 4 constructors with 4 different access levels of
    // constructors(private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
    // 2 - from outside the class; 3 - from different class inside different package  and observe result.

    /*private Task1(){
    System.out.println("Constructor with parameters");
}
Task1(String name){
    System.out.println("Constructor with string para meter");
}
Task1(int )
}
*/
   // class Main {
        int i;
        double d;
        char c;



        public static void main(){
            Task1 one=new Task1();
            one.i=10;
            one.d=10.23;
            one.c='a';
            System.out.println(one.i);


            Task1 two=new Task1();
            two.i=100;
            two.d=100.23;
            one.c='s';

            System.out.println(two);



        }}
/*

    static int method(int n){
        int sum=0;
        if(n%2==0){
            for(int i=1; i<=n ;i++)
            {sum+=i;}

        }return sum; }

    public static void main(String[] args){
        int num=5;
        System.out.println( method(num));
    }
*/
  /*  static String method(String s, char c){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==c){

         s=s.replace(c,'*');}}
        return s;
    }
    public static void main(String[] args){
        String str="computer science";
        char ch='e';
        System.out.println( method(str,ch));
    }
}*/

  /* static void m1(){
        System.out.println("m1 method implementation");
    }
    static void  m2(){
        System.out.println("m2 method implementation");
    }

    public static void main(String[] args) {
m1();
m2();*/

                /*Scanner inp = new Scanner(System.in);
                System.out.print("In:");
                String givenString = inp.nextLine();
                //write your code below
                StringBuilder str=new StringBuilder(givenString);
                StringBuilder revstr =new StringBuilder();
                revstr=str.reverse();
                String rev=revstr.toString();

                System.out.println(rev);
                givenString=givenString.replaceAll(" ","");
               rev= rev.replaceAll(" ","");
        System.out.println(rev);
                if (givenString.equalsIgnoreCase(rev)){
                    System.out.println("true");
                }else{System.out.println("false");}*/

      /*  Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        String  rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);}

        System.out.println(rev);
*/
      /*  Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for(int i=0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }*/




/*
        Scanner input=new Scanner(System.in);

        String []name=new String[1];

        for(int i=0; i<1; i++)
        {
            name[i]=input.nextLine();
            for(String s:name)
            {System.out.println(s.replaceAll("[^aeiouyAEIOUY]",""));}*/
       // }
     /*   StringBuilder str=new StringBuilder();
        str.append("Hello");
        str.append(" world");
        String str1=str.toString();
        System.out.println(str1.toUpperCase());*/
       // public static void main(String[] args){







