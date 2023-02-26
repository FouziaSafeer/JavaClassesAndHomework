package classNo29;

import java.util.LinkedHashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        //does not dubpilcate , not save in order
// does not allow dublicate and retain the insersion order

        LinkedHashSet<String>fruit=new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("gauwa");
        fruit.add("Banana");
        fruit.add("Kiwi");
        System.out.println(fruit);
    }
}
