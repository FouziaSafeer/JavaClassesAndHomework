package ClassNo12;

public class StringDemo7 {
    public static void main(String[] args) {
        String str="I Love java";
        boolean startsWith=str.startsWith("I");//case sensitive

        System.out.println(startsWith);


        System.out.println(str.endsWith("java"));//end with letter
// only those methos can be chanined which returns a string
        System.out.println(str.toLowerCase().startsWith("i"));//mething chaining multiple methods are called on same line


        System.out.println(str.contains("java"));
    }
}
