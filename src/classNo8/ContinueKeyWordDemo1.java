package classNo8;

public class ContinueKeyWordDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if(i%3==0){
                continue;//skip
            }
            System.out.println(i);
        }
    }

}
