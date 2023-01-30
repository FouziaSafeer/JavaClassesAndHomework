package ClassNo12;

public class StringDemo8 {
    public static void main(String[] args) {
        String str="Java is love";
        char c=str.charAt(0);//at zero mlocation
        /*char c=str.charAt(1);//at zero mlocation
        c c=str.charAt(3);//at zero mlocation
         c=str.charAt(4);//at zero mlocation*/
        int count=0;

        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)=='a'){
                count++;
         //   System.out.print(str.charAt(i)+" ");
        }} System.out.println(count);

    }
}
