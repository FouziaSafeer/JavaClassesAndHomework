package classNo29;

import java.util.HashSet;
import java.util.TreeSet;

public class SetTask {
    public static void main(String[] args) {
        /*Create a Set collection in which you need to add names of the countries.
        In this set we want all objects to be sorted in alphabetical order.
         Using 2 different ways retrieve all elements from set.*/

        TreeSet<String> countriesName=new TreeSet<>();
        countriesName.add("Pakistan");
        countriesName.add("Saudi");
        countriesName.add("Dubai");
        countriesName.add("Qatar");
        countriesName.add("Oman");
        countriesName.add("Bharain");

       System.out.println(countriesName);
        for (String s:countriesName) {
            System.out.print(s+" ");

        }

    }
}
