package classNo28;

import classNo26.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {
        //arrayList<String>name =new ArrayList<>();
        ArrayList<String> name=new ArrayList<>();// before java 5 ArrayList name =new ArrayList();
            Object a=new String("Some value");
            Object b=new Integer(10);
/// no one now use array like this
            Object c=new Scanner(System.in);
     ArrayList name1=new ArrayList();
     name1.add("EHSAN");
     name1.add(10);
     name1.add('a');

        for (Object j:name1) {
            System.out.println(j);/// (String)j.trim();

        }
        ArrayList<String> name2=new ArrayList<>();
       // name2.add(45);///error at comple time// storing int in string





    }
}
