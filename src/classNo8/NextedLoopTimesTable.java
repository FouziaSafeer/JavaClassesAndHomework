package classNo8;

public class NextedLoopTimesTable {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println();
        }
        System.out.println("-------------------------------");

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("_____________________________________");

        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");

            }
            System.out.println();
        }
        System.out.println("----------------------------");

        for (int i = 1; i <5 ; i++) {

            for (int j = 1; j <5 ; j++) {
                if(i==2 && j==2 ||i==3&&j==2 || i==2 && j==3 ||i==3&&j==3){
                    System.out.print(" ");
                     continue;}

                System.out.print("$");

            }
            System.out.println();

        }
        }}


           // System.out.println();



