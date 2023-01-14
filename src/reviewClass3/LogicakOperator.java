package reviewClass3;

public class LogicakOperator {
    public static void main(String[] args) {
        boolean loginButtonDisplayed=true;
        boolean loginButtonclickable=false;
        if(loginButtonclickable&&loginButtonDisplayed){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test failed");

    }
        System.out.println("--------------or------------------");
    boolean dashBoard=false;
        String welcomeMessage="Wellcome";
        if (dashBoard||welcomeMessage.equals("Wellcome")){
            System.out.println("you are login successfully ");
        }else{
            System.out.println( "Unable to login");
        }
        System.out.println("--------------not------------------");




    }
}
