package classNo19;

public class BankAccount {//parent class/super class/base class
    long accountNumber;
    double money;
    void deposit(){
        System.out.println("Deposit method from parent  acount class");
    }

}

class Checking extends BankAccount{//child class or subclass/derive class
    double interest;
    void transfer(){
        System.out.println("Transfer method from child checkin class");
    }
}
class Saving extends BankAccount{
    double profit;
    void takeProfit(){
        System.out.println("PRofit method from saving class");
    }
}
class SuperSaving extends Saving{

    void SuperSaving(){
        System.out.println("Super saving method from super saving class");
    }




}