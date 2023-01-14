package homeWork04ForLoops;

public class ForLoop3 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)
        for(int i=20; i>=1; i-=2){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("------------2nd method-------------------");
        for(int j=20; j>=1; j--){
            if(j%2==0){
                System.out.print(j+" ");
            }
        }
    }
}
