package classNo16;

public class Person {
    private double bankBalance =1250000;
    String address="Street 123";// default access level is applied
   public String name="Jon Snow";


    private void printPhonePassword(){
       System.out.println("pass132");
   }
   void printSNN(){
       System.out.println("123456789");
   }
 public void printTikTokAccount(){
     System.out.println("User123");

}



    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printPhonePassword();
        person.printSNN();
        person.printTikTokAccount();

    }
}
