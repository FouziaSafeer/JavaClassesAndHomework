package classNo23;

public class Task11 {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(500,10);
        creditCard.calculateIntertest();
        AX ax=new AX(500,10);
        ax.calculateIntertest();


    }
}
   // String, scanner,String buffer,math  try to see these funtion

class CreditCard{
    double balance;
    double interest;


   public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public CreditCard(double balance) {
        this.balance = balance;
    }
    /*  CreditCard(Double balance,double interet){
        this.balance=balance;
        this.interest=interet;*/

    public void calculateIntertest(){
       System.out.println("Interest "+ (balance*interest) /100);
    }}

class AX extends CreditCard{
    AX(double balanec, double interest){
        super(balanec,interest);
    }

    @Override
    public void calculateIntertest() {
    //    super.calculateIntertest();
        System.out.println("Interest "+ (balance*interest) /100+30);
    }
}

