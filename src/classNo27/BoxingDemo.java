package classNo27;

public class BoxingDemo {
    public static void main(String[] args) {
        int number=15;//wrapping and unwaraaping this is flexibilty is with wrapper class only ,process is call boxing and unboxing
        printData(number);//before java 5 we need to manually but now its automatic, auto boxing

    Integer f=10;//autobox;
        int number2=f;//unboxing///wrapping class to non premitive

    }//framework make it easy, eg agile framwork things easy


    public static  void printData(Integer number){
        System.out.println(number);
    }
}
