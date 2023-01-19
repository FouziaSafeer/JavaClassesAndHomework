package classNo10;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] num={10,20,30,40,50};
       // System.out.println(num[4]);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("_______________________");
           for(int number:num){//enhance for each loop
               //when ever possible use below loop
               System.out.println(number);
           }



    }
}
