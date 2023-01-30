package ClassNo12;

public class StringDemo5 {
    public static void main(String[] args) {
        String str ="Java";
        String str1="JAVA";
        boolean areequal=str.equals(str1);
        System.out.println(areequal);


        Boolean areequals=str.equalsIgnoreCase(str1);
        System.out.println(areequals);
    }
}
