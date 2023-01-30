package ClassNo12;

public class StringDemo10 {
    public static void main(String[] args) {
        String str ="Java is not pain";
        System.out.println(str.indexOf("J")); //str.indexOf("J")
        System.out.println(str.indexOf("a")); //str.indexOf("J")
        System.out.println(str.indexOf("p")); //str.indexOf("J")
        System.out.println(str.indexOf("pain")); //for word thatds y double quote
        System.out.println(str.indexOf("u")); //not present in string
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+i);
        }


    }
}
