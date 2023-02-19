package classNo19;

public class Test {
    public static void main(String[] args) {


        BankAccount ba=new BankAccount();
        ba.accountNumber=47859945699l;
        ba.money=1000;
        ba.deposit();


        System.out.println(ba.accountNumber);
        System.out.println(ba.money);


        System.out.println("CREAte an object of checlin account");

        //feature from parent
//ba.transfer(); methods from child class is not available to child class
        Checking check=new Checking();
        check.accountNumber=164848936;
        check.money=788;
        //feature from checkin class
        check.interest=0;
        check.deposit();//from parent
        check.transfer();//from child




       Saving save= new Saving();
       save.accountNumber=1236549+6;
       save.money=455;
       save.profit=100;
       //save.interest=0;//its sibling account u cant access
        //extends only one class

        save.deposit();//from parent
       save.takeProfit();//comes from saving
        //save.trasfer(); not avaialable

        System.out.println("This is grandchild feature after this");
        //finish creating SuperSAving object n see
        SuperSaving ssave=new SuperSaving();
        ssave.accountNumber=456131645;
        ssave.money=7894;
        ssave.takeProfit();
        ssave.deposit();
        ssave.SuperSaving();
    }

}
