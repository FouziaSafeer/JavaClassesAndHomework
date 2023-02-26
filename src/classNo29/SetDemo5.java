package classNo29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo5 {
    public static void main(String[] args) {


        ArrayList<Integer>number=new ArrayList<>();
        number.add(10);
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(30);

        LinkedHashSet<Integer>uniqueno=new LinkedHashSet<>(number);
        System.out.println(uniqueno);

      //  System.out.println(number);
        HashSet<Integer> number2=new HashSet<>();
        number2.add(10);
        number2.add(10);
        number2.add(20);
        number2.add(30);
        number2.add(30);
        System.out.println(number2);




}}
