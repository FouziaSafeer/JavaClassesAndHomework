package classNo8;

public class Square {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            if (i == 1 ) {
                System.out.println("");
                continue;
            }
            for (int j = 0; j < 5; j++) {
                if(i==0 || i==1 ||i==2)

                System.out.print("*");
            }
            System.out.println("");
        }
    }



}
