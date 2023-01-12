package ClassNo2;

public class StringCon {
    public static void main(String[] args) {
        String firstName="fouzia";
        String lastName="safeer";
        //java execute top to bottom and with multiple command from left to right

        System.out.println(  "***"+ firstName +"  " +  lastName +"***");// left to right code will execute
        System.out.println("First Name="+ firstName);
        System.out.println("Last NAme= "+lastName);
        System.out.println("10"+"10");// will print 10 10 its not int data type
            //combine to string with other datatype
        System.out.println(firstName+"  "+ 10);
        System.out.println(firstName+ 10.5);
        System.out.println( firstName +true);
    }


}
