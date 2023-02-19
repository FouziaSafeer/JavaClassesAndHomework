package classNo28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        Long startTime=System.currentTimeMillis();
        ArrayList<String> number=new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            number.add(0, "Test Data");
        }
            Long endtTime=System.currentTimeMillis();
            System.out.println(endtTime-startTime);

    }
}
