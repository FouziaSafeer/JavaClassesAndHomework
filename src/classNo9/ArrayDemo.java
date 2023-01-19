package classNo9;

public class ArrayDemo {
    public static void main(String[] args) {
        String name="Slava";
        String name2="safi";
        String name3="jason";
        String name4="jason";
        String name5="anees";
        //solution array
        String [] names={"SAlava","safi","jason","Anees","joseph"};

        System.out.println(name2);//from variable
        System.out.println(names[1]);//saffi from array
        System.out.println(names[4]);
        System.out.println(names);
        //System.out.println(names[500]); error because there is no index
       // System.out.println(names[-5]);  error because index cant be negative

      // print from arry
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
    }
}
