package reviewClassno9;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

      // interger Rapper class
       ArrayList<Integer> alist= new ArrayList<>();//always use wrapper class for <>
        //to store value inside an arraylist
        alist.add(12);
        alist.add(13);
        alist.add(14);
        //how to find array of array list
      int size=  alist.size();
        System.out.println("Size of array list "+size);
        //to acces value
        int firstalliment = alist.get(0);
        System.out.println(firstalliment);
        alist.set(0,120);//replaceing value of first value
        firstalliment= alist.get(0);
        System.out.println(firstalliment);

        //remove elements
        alist.remove(2);
        System.out.println(alist);
    }
}
