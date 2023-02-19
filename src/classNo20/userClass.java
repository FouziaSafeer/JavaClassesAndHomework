package classNo20;

public class userClass {
    /*Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable and
     it also being initialized through constructor call.
     Print users name, mobile number and address in userDetails method. Test your code.*/
    String name;
    String mobileNo;
    userClass(String name,String mobileNo){
        this.name=name;
        this.mobileNo=mobileNo;
    }

}
class userInfo extends userClass{
    String address;

    userInfo(String name,String mobileNo,String address){
        super(name,mobileNo);
        this.address=address;

       // display(String name,String mobileNo,String address){
        System.out.println("User Name "+name + "  Address "+address+ " Mobile no "+mobileNo);//}

    }
}