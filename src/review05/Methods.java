package review05;

public class Methods {


   // private static int[] arr1;

    void hello(){
        System.out.println("Hello");
    }

    void sayHello(String name){
        System.out.println("Hello "+ name);
    }
    int largerNumber(int n1, int n2) {

        if(n1>n2){
            return n1;
        }else return n2;

    }
    double average(double num1,double num2){

        return (num2+num1)/2;


    }
    String rev(String str){
       StringBuilder st1=new StringBuilder(str);
      return st1.reverse().toString();
     // str=st1.toString();
      //return str;
    }
        String rev1(String str){
        String revs="";
        for (int i=str.length()-1; i>=0; i--)
        {
            revs=revs+str.charAt(i);
        }
           // System.out.println(revs);


        return revs;
        }

      public static  int minim(int[] arr){
        int num= arr[0];
        for(int i=0; i<arr.length-1;i++) {
            if (arr[i] < i) {
                num = arr[i];
            }
            //   System.out.println(num);

        } return num;}


    public static void main(String[] args) {
       String name ="fouzia";
       int charachters=name.length();
        System.out.println(charachters);
        Methods m1=new Methods();
        m1.hello();
        m1.sayHello(name);
        int largerno=m1.largerNumber(45,55);
        System.out.println(largerno);

        System.out.println(m1.average(45.45,55.55));
        System.out.println( m1.rev("fizzy"));
        System.out.println(m1.rev1("fizzy"));
        int [] arr={1,2,4,7,-5,5};
        //System.out.println(m1.minim( arr));
        System.out.println(Methods.minim(arr));
    }}