package reviewClassno9;

import java.util.ArrayList;

interface HasWings {

    public abstract Object getWindSpan();

}


public class ArrayListDemo1 {
    public static void main(String[] args) {
     ArrayList<String> computers  =new ArrayList<>();
     computers.add("MacBook pro");
     computers.add("HP");
     computers.add("Lenovo");
     computers.add("DEll");
    // computers.add("");


        System.out.println(computers);
        for (String s:computers) {
            System.out.print(s+" ");

        }
        System.out.println("");


        for (int i=0; i< computers.size();i++)
        {

            String s=computers.get(i);
            System.out.print( s+" ");

        }
        System.out.println("\n__________________");
    }







}
