package ClassNo3;

public class TypeCasting_5 {
    public static void main(String[] args) {



        long number=125;
        byte shorNumber=(byte)number;
        float f=10.5f;
        int num=(int)f;
        System.out.println(shorNumber);
        System.out.println(num);
/*
            byte
            short
            int
            long
            float
            double
            if we try to store contents from a smaller box to larger box java does not complian
            because content can easily fior in larger box but if we try smaller box an error and we need
             to type cast it to store the content
             billion of line of code

 */
            byte b=10;
            int number2=b;
            short c =(short)number2;
        System.out.println(b);
        float eggs=12.5f;
        int wholePart=(int)eggs;
        System.out.println(wholePart);
       // System.out.println(char(98));

    }
}
