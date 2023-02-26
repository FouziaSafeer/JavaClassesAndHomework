package classNo29;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {
// hash set does not allow duplicate value...
        HashSet<String>fruit=new HashSet<>();
        fruit.add("mango");
        fruit.add("kiwi");
        fruit.add("orange");
        fruit.add("mango");
        System.out.println(fruit);






    }
}
