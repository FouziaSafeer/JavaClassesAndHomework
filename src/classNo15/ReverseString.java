package classNo15;

public class ReverseString {
    public boolean reverseStr;

    String reverse(String s){
        String reverse="";
        for (int i = s.length()-1; i >=0 ; i--) {
          reverse+=s.charAt(i);
           // System.out.println(s);
            //System.out.println(s.charAt(i));

        }return s;
    }



    String reverseStr(String input){
        String newStr="";
        for (int i =input.length()-1 ; i>=0 ; i--) {
            newStr+=input.charAt(i);
        }

        return newStr;
    }


    String reverseStr1(String input){
        return new StringBuilder(input).reverse().toString();
    }

    String reverseStr2(String input){
        StringBuilder stringBuilder=new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
