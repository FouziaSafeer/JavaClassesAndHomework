package ClassNo12;

public class StringDemo9 {
    public static void main(String[] args) {
        String str="vcdfvsdb  123154 @$^&";
       int counter=0;
      /*  for (int i = 0; i < str.length();   i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                counter++;
        }

        }  System.out.println(counter);*/
        for (int i = 0; i < str.length();   i++) {
            if(Character.isDigit(str.charAt(i))){
                counter++;
            }

        }  System.out.println(counter);

      /*  for (int i = 0; i < str.length();   i++) {
       if(Character.(str.isEmpty()  charAt(i))){
                counter++;
            }

        }  System.out.println(counter);
*/
    }
}
