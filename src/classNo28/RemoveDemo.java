package classNo28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("mava");
        words.add("Computer");
        words.add("Lava");

// it doesnot work java 9 or below
        var name="jbfkjdfkdf";// for variables it guess byu it self
        var c='c';
        var f=12.5;

           // words.removeIf(s->s.endsWith("a"));

        // use iterator works, interface

///we can achive this with one method after java 8
        // System.out.println(iterator);
        words.removeIf(s -> s.endsWith("a"));// doest not work java 7



        /*while(iterator.hasNext()){
            String s=iterator.next();
            if(s.endsWith("a")){
                iterator.remove();
            }
        }*/
        System.out.println(words);


    }
}
