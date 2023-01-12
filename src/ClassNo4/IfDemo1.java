package ClassNo4;

public class IfDemo1 {
    public static void main(String[] args) {

        int money = 15000;

        if (money > 1000) {
            System.out.println("lets buy iphone");
        }

        if (money > 2000) {
            System.out.println("lets also buy a mac book");
        }

        boolean mothersday = true;
        if (mothersday) {
            System.out.println("happy mothers day");
        }
        String name = "Sardar";


        // for non premitive data type
        if (name.equals("Sardar")) {
            System.out.println("he like bootball");
        }
    }
}
