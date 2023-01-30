package ClassNo12;

public class StrinfDemo11 {
    public static void main(String[] args) {
        String str ="Send it to support channel. More java";
        //we only specify starting point
        String newstr=str.substring( 28);
        //String newstr=str.substring( 28);
        System.out.println(newstr);
        // we can secify starting point and ending point
        System.out.println(str.substring(0,27));


    }
}
