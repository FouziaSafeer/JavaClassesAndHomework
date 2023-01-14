package homeWork04ForLoops;

public class Forloop01 {
    public static void main(String[] args) {
        // write a loop to print numbers from 1 to 100
         // write a loop to print odd numbers from 1 to 15
        // write a loop to print these number 5,10,15,20,25,30.... 50
        System.out.println("1) numbers from 1 to 100---------");
        for(int i=1; i<=100;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("2) Odd numbers from 1 to 15---------");
        for(int j=1; j<=15; j+=2){
            System.out.print(j+" ");
        }
        System.out.println("");
        System.out.println("3)number 5,10,15,20,25,30.... 50-------");
        for(int k=5; k<=50; k+=5)
        {
            System.out.print(k+" ");

        }


    }

}
