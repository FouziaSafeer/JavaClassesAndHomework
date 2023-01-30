package reviewClass4;

public class Forloop {
    public static void main(String[] args) {
        //best loop when we know how many we want to repeat code
        for (int i = 2; i < 20; i+=5) {
            System.out.println(i);
            if(i==12){
                System.out.println("AS its 12 i am breaking loop");
                break;
            }}


            for (int j = 0; j <= 10; j++) {
                if(j%3==0){
                    System.out.println(j);
                    continue;
                }

                System.out.println("hello");
            }

        // break and continue
    }
}
