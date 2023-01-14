package classNo8;

public class BreakKeyWord {
    public static void main(String[] args) {
        boolean summer = true;
        int temp = 75;
        while (summer) {
            if (temp <= 100) {
                System.out.println("i love summer because temperature is " + temp);

            } else {
//                System.out.println("its very hot");
//                break;
//            }
                temp += 5;
            }
        }
    }}
