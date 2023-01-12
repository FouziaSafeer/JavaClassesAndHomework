package classNo5;

public class LocgicalOperator2 {
    public static void main(String[] args) {


        double mathsScore=92.5;
        double historyScore=90.5;
      double   ScienceSCore=93.5;
    /*  if (mathsScore>90){
          if (historyScore>90){
              if(ScienceSCore>90)
              {
                  System.out.println("Smart student");
              }
          }
      }else System.out.println("Need hard work");


*/
        if(mathsScore>90&& historyScore>90&& ScienceSCore>90){
            System.out.println("You are brilliant Student");
        }else{

            System.out.println("Need hard work");
        }


    }
}
