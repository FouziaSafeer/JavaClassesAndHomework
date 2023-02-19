package classNo28;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        //for collection frame works
        ArrayList<String>words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("mava");

        words.add("Computer");
        words.add("Lava");

        for(int i=0; i< words.size(); i++)// problem in
        {if(words.get(i).endsWith("a")){
            words.remove(i);
        }
        }  System.out.println(words);
    }



       /* for (String s:words) {//concurrancy//
         if(s.endsWith("a"))
         {
             words.remove(s);
         }

        }
        System.out.println(words);
    }*/






}
