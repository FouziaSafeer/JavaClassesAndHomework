package classNo24;

public class PhoneTester {
    public static void main(String[] args) {
        Phone []phones={new samsung(),new iPhone()};
        for (Phone po:phones) {
            po.display();
            po.SendText();
            po.display();
            System.out.println("-------------------");

        }
    }
}
