package classNo29;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
// in maps we store two value togather key n value and no add method we have
        //put method//we use get method we specify they key n thne get value
        ////HashMaps<>not sorted
        //LinkedHashMaps<> order is maintain
      //  HashMap<String,Integer> groceries=new HashMap<>();/// to order in LinkedHashMap if for order
        TreeMap<String,Integer> groceries=new TreeMap<>();
        groceries.put("Eggs",10);
        groceries.put("Milk",5);
        groceries.put("bread",5);
        groceries.put("Crips",10);
        groceries.put("cheeze",12);
        groceries.put("fruit",15);
        System.out.println(groceries.get("bread"));// will print keys
        System.out.println(groceries);
        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());///size of map
        //System.out.println(groceries.remove(10));//
        // methods in maps imp..... isEmpty,
      //  System.out.println(groceries);
        groceries.remove("bread");//remove
        System.out.println(groceries);

    }
}
