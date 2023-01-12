package classNo5;

public class LogicalOperator1 {
    public static void main(String[] args) {

        System.out.println(true|| true);//true
        System.out.println(true|| false);//true
        System.out.println(false|| false);






        boolean boughtchoc=false;
        boolean broughtFlower=false;
        if(boughtchoc||broughtFlower){
            System.out.println("HAPPY");

        }else {
            System.out.println("SAD");
        }

        boolean wifi=false;
        boolean fiveG=false;
        if(wifi||fiveG){
            System.out.println("you are good for brwosing");
        }else{
            System.out.println("connect to wiwfi or 5g");
        }
            /// home work

        if (wifi){
            System.out.println("connected");
        }
        else {
            System.out.println("connect to internet");
        }
        if(fiveG) {
            System.out.println("Connected");
        }else {
                System.out.println("");
            }

        }

    }

