package classNo29;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        // Dog d1=new Dog("jackey","persian",15);



     /*   ArrayList<Dog>dogs=new ArrayList<>();
       // Dog d1=new Dog("jackey","persian",15);
        dogs.add(new Dog("jackey","persian",15));
        dogs.add(new Dog("jimmy","Derman",16));
        dogs.add(new Dog("jum","persian",5));
        dogs.add(new Dog("julll","Buldog",12));
        for (Dog d:dogs) {
            d.printDogName();
        }*/

           // System.out.println(d.printDogName());

        /*public class ArrayListDemo1 {
    public static void main(String[] args) {
*/
        //Dog d1 = new Dog ("Mango", "Dachund", 2);

        ArrayList <Dog> newDog = new ArrayList<>();
        newDog.add(new Dog ("Mango", "Dachund", 2));
        newDog.add(new Dog ("Kiwi", "Dachund", 1));
        newDog.add(new Dog ("Lime", "Dachund", 1));

        for (Dog dogZ : newDog) {
            dogZ.printDogName();
        }
    }
}


