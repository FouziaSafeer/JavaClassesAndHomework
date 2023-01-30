package reviewClass4;

public class ForLoopCarMeter {
    public static void main(String[] args) {
       /* for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <=9; k++) {
                    for (int l = 0; l <=9 ; l++) {
                        System.out.println(i+" "+j+" "+k+" "+l+" ");


                    }
                    System.out.println();

                }
                System.out.println();


            }
            System.out.println();

        }*/
        
        
        //clock
        for (int hour = 1; hour <24 ; hour++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                for (int seconds = 0; seconds <60 ; seconds++) {
                    System.out.println (hour+":"+minutes+":"+seconds+" ");
                    
                }
                System.out.println();
                
            }
            System.out.println();
            
        }
        System.out.println();
    }
}
