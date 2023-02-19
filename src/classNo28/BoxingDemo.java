package classNo28;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {
        Integer integer=new Integer(10);
        int number=integer;//its auto unboxing
        int number2=integer.intValue();//unboxing

        double d=12.3;
        Double wrapping=new Double(d);//boxing
        Double wrapperP=d;///auto boxing
        Float f=12.f;
        ArrayList<Float>arrayList=new ArrayList<>();
        arrayList.add(12.0f);
        double fh=12f;


    }
}
