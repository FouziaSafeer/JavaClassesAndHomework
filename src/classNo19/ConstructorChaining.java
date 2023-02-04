package classNo19;

public class ConstructorChaining {
        ConstructorChaining(){
        System.out.println("I am non argument constrctor");}


         ConstructorChaining(String str){
           this();// caling constructor with no argument
        //should ve always first line
            System.out.println(str);
        }
        ConstructorChaining(String str ,int num){//signature is diffrent as parameter difftrent
            this(str);
            System.out.println("this is contrctor with interger parameter"+num);
        }

    public static void main(String[] args) {
        ConstructorChaining obj=new ConstructorChaining("hello",10);
        System.out.println("end");
    }





    }







