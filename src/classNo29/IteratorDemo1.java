package classNo29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.0);
        numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.3);
//we can print all valyes from list
      /* for (Double num:numbers) {
            if(num>11) //error comes exception change index on run time we we use loops in array list
                numbers.remove(num);// we are removing value greater then 10.
           // System.out.println(num);

        }*/
/*
        numbers.remove(40.5);// removing things
        System.out.println(numbers);*/


      /*  numbers.remove(1);// remove things by index
        System.out.println(numbers);*/

    /*    numbers.removeIf(number ->number >11);////remove elemnts  if this condition is true
        // number is variable we dont need to specify data type, we can use x , y etc
        System.out.println(numbers);
*/


        //other way is iterative to move around
        Iterator<Double> iterator=numbers.iterator();// already in java returns iterator over list in proper list
        // iterator have three main method   1 hasnext 2.next 3. remove
     /*   System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());*/
       // System.out.println(iterator.next());
       // System.out.println(numbers);
        // hasnext keep in returning true until we have data in list
// watch lemda expression cod
        while(iterator.hasNext()){
           double numb= iterator.next();
           if(numb>11)
           {iterator.remove();}
        }

        System.out.println(numbers);
    }
}
