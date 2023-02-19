package classNo26;

public class Account {
    double balance;
    String accountNumber;
    String type;
    String acounttiltle;

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() != 16) {
            System.out.println("account number is wrong");

        } else {
            this.accountNumber = accountNumber;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {// initializing the inpur value,sanitizer
        if (balance < 0) {
            System.out.println("negative balance is not allowed");
        } else {
            this.balance = this.balance + balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAcounttiltle() {
        return acounttiltle;
    }

    public Account(double balance, String accountNumber, String type, String acounttiltle) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.acounttiltle = acounttiltle;
    }
}

class AccountTester {
    public static void main(String[] args) {
        Account account = new Account(1254, "fdfff", "fdsf", "FDFDFFD");
        System.out.println(account.getAcounttiltle());
        account.setBalance(-7845);

    }


















/*  void depositFunds(double balance){
        this.balance=this.balance+balance;

    }


    void withDraw(double balance){
        if(balance<this.balance){
            this.balance=this.balance-balance;
        }
    }*/
}
/*Methods (Most Important)
String Class =
Loops
Arrays
Variable types in Java
Access Modifier (Skim)
Constructor
this (keyword)
Inheritance (Cucumber Class)
Super (very rare)
Overriding
Implementing an interface
Polymorphism
Finak Keyword( maybe not )
abstraction (important but not all the details)
interface (important)
Encapsulation(not important for selenium)*/