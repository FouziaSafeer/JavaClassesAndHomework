package classNo27;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        // they create equilient class so we can use in arraylist methods
        // * byte--> Byte
        // * short-->Short
        // *int===> Interger
        //long--->Long
        //float-->Float
        // *double-->Double
        // *char-->Charactor
        // *boolean-->Boolean
        ArrayList<Integer> number=new ArrayList<>();//cant not use premitive data type, and slow
        number.add(12);
        number.add(14);
        number.add(15);
        number.add(16);
        number.add(17);
        number.add(18);
        number.add(19);
        number.add(20);
        System.out.println(number);
    }
}
