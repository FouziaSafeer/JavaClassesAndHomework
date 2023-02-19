package classNo21;

public class Programming {
    /*Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
     then the message "I love programming languages" should be printed. If some String is passed to it,
     then in place of "programming languages" the value variable should be printed.
     Example, if we pass "Java", then "I love Java" should be printed*/
    Programming(){
        System.out.println("I love programming languages");
    }

    Programming(String lang){
        System.out.println("I love "+ lang);
    }

}
class tester{
    public static void main(String[] args) {
        Programming java=new Programming();// new programming (); it works too as its constructor
        Programming C=new Programming("C++");

    }
}
