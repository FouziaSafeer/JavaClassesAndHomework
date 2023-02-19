package classNo27;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Character> character=new ArrayList<>();
        character.add('A');
        character.add('B');
        character.add('C');
        character.add('D');
        character.add('E');
        character.add('F');

        for (Character c:character) {
            System.out.print(c+"  ,  ");
        }
    }
}
