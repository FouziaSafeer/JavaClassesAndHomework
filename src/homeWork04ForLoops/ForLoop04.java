package homeWork04ForLoops;

public class ForLoop04 {
    public static void main(String[] args) {
       // Print odd numbers between 20 and 50 (2 ways)
        for(int i=21; i<=50; i+=2){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("------------2nd method-------------------");
        for(int j=20; j<=50; j++) {
            if (j % 2 == 1) {
                System.out.print(j + " ");
            }
        }}}