package classNo07;

public class Task1 {
    public static void main(String[] args) {
        boolean workDay=true;
        int day=1;
        while (workDay){
            if(day<=5){
                System.out.println("I need a day off");
            }else{
                System.out.println("i dont need off");
           workDay=false;
            }


        }

    }
}
