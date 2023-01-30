package reviewClass4;

public class MoreLoops {
    public static void main(String[] args) {
        for (int i = 0; i <=3; i++) {
            System.out.println(i);//0 1 2 3
            for (int j = 0; j >=3 ; j++) {
                System.out.println(j);

            }

        }
        System.out.println("------------------------");

        for (int i = 0; i <=3; i++) {

            for (int j = 1; j <=3 ; j++) {
                System.out.print(i+" ");

            }System.out.println();

        }
        System.out.println("------------------");

    }

}
