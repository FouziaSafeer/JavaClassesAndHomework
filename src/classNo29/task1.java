package classNo29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class task1 {
    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        // not sorted
        HashSet<String> nonSortedList = new HashSet<>(aList);
        System.out.println(nonSortedList);
        System.out.println("--------------------");
        //sorted list
        TreeSet<String> sortedList = new TreeSet<>(aList);
        System.out.println(sortedList);



    }
}
