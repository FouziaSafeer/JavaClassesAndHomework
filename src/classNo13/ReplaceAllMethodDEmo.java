package classNo13;

public class ReplaceAllMethodDEmo {
    public static void main(String[] args) {
        String str="KJFDBVKMPDFVKJxnmvdfkvnkl12315456;]]43*&^";

        //replaces all upper case letters from A-Z
        System.out.println(str.replaceAll("[A-K]","#"));//any thing in upper case to # A-Z is range A-K multiple
        ////replaces all lower case letters from a-z
        System.out.println(str.replaceAll("[a-z]","@"));//any thing in upper case to # a-z is range A-K multiple
        //replaces all lower case letters from 0-9
        System.out.println(str.replaceAll("[0-9]","?"));//0-9
        //replaces all lower case letters from A-Z & a-z
        System.out.println(str.replaceAll("[A-Za-z]","#"));//all letter
       ////replaces all upper case letters from A_Z and lower a-z and numbers aswell
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));//mixed
       ////do not replaces all upper case letters from A-Z
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));//mixed key 6 have ^carrot symbol
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));// to delete or removed







    }
}
