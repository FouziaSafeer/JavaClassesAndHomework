package classNo13;

public class SplitMethodDemo {
    public static void main(String[] args) {
        String str="I like java. I write alot of code daily. i m from batch 25.";
        String[] strArr=str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[1].trim());// remove spaces
        System.out.println(strArr[2].trim());
        //when ever we are working with array we use length, where as in string will use length()
boolean ends=str.endsWith(".");
        System.out.println(ends);
        System.out.println(str.indexOf("j"));

    }
}
