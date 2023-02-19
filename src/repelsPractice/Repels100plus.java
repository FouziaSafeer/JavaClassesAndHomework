package repelsPractice;


    class Main extends Method {
        public static void main(String[] args) {
            //System.out.println("hello world");

            int[][] a = {

                    { 1, 2, 3 },

                    { 4, 5, 6 },

                    { 7, 8, 9 }

            };

sum2D(a);






        }
    }

class Method{

    static void sum2D(int[][] arr){
        /*static int[][] reduce10(int[][] arr) {
        for (int[] i : arr) {
        for (int j : i)*/
int sum=0;
        for (int i=0; i< arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++) {

               sum=arr[i][j]+sum;
            }
            }
        System.out.println(sum);

        }
    }


/*
class Main {//150
    public static void main(String[] args){
        Employee emp=new Employee("Joe","Smith",35,35000);
        emp.print();
        Student st1=new Student("Asam","Smith",15,10,10);
        st1.print();
        Retiree ret=new Retiree("Frank","Smith",15,0,0,"tour");
        ret.print();
*/
/*
Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour*//*

    }}
class Person{

    String name;
    String lastName;
    int age;
    */
/*int salary;
    int grade;*//*

    String seniorActivity;

    Person(  String name,String lastName,int age)
    {
        this.name= name;
        this.lastName=lastName;
        this.age=age;
       // this.salary=salary;


    }

}

class Employee extends Person{
    int salary;
    Employee(String name,String lastName,int age,int salary){
        super(name, lastName, age);
        this.salary=salary;
    }

    void print(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}

class Student extends Employee{
    int grade;

    public Student(String name, String lastName, int age, int salary, int grade) {
        super(name, lastName, age, salary);
        this.grade = grade;
    }



    void print(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }
}

class Retiree extends Student{
    String seniorActivity;


    public Retiree(String name, String lastName, int age, int salary, int grade, String seniorActivity) {
        super(name, lastName, age, salary, grade);
        this.seniorActivity = seniorActivity;
    }

    void print(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }
}
*/



    /*class Main {
        public static void main(String[] args) {


        Employee emp=new Employee("Joe","Smith",35,35000,2,"tour");
                emp.print();




         }}
    class Person{

        String name;
        String lastName;
        int age;
        int salary;
        int grade;
        String seniorActivity;

        Person(  String name,String lastName,int age,int salary,int grade,String seniorActivity)
        {
            this.name= name;
            this.lastName=lastName;
            this.age=age;
            this.salary=salary;

        }

    }

    class Employee extends Person{
        Employee(String name,String lastName,int age,int salary,int grade,String seniorActivity){
            super(name, lastName, age, salary, grade, seniorActivity);
        }

        void print(){
            System.out.println(name+" "+lastName+" "+age+" "+salary);
        }
    }

    class Student extends Employee{
        Student(String name,String lastName,int age,int salary,int grade,String seniorActivity)
        {
            super(name, lastName, age, salary, grade, seniorActivity);
        }

        void print(){
            System.out.println(name+" "+lastName+" "+age+" "+salary);
        }
    }

    class Retiree extends Student{
        public Retiree(String name, String lastName, int age, int salary, int grade, String seniorActivity) {
            super(name, lastName, age, salary, grade, seniorActivity);
        }

        *//*  Retiree(String name,String lastName,int age,int salary,int grade,String seniorActivity){

                    super(name, lastName, age, salary, grade, seniorActivity);{
                    }
                }
        *//*
        void print(){
            System.out.println(name+" "+lastName+" "+age+" "+salary);
        }
    }




  *//*     // class Main {
                public static void main(String[] args){
                        CarObjects toyota=new CarObjects("Toyota 2019",250000.0,10);
                        CarObjects bmw=new CarObjects("BMW 2019",326490.0,2);
                       double value= toyota.carStockValue();
                        System.out.println(toyota.model+" "+"Stock Value "+toyota.carStockValue());

                    System.out.println(bmw.model+" "+"Stock Value "+bmw.carStockValue());
                }
}*//*
*//*class CarObjects{
        String model;
        Double price;
        int quantity;
        CarObjects( String model,Double price,int quantity){
                this.model=model;
                this.price=price;//250000,326490
                this.quantity=quantity;//10,2
        }
        double carStockValue(){
                double value=price*quantity;
               // System.out.println("Stock Value "+value);
return value;
        }*//*


        *//***In carObject class:**

         Create instance variables as below.

         - model
         - price,
         - quantity

         Create a constructor that will initialize instance variables.

         Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result.

         run the application in Main Class

*/      //   **Expected Output:**

        // ```
         //Toyota 2019 Stock Value 2500000.0
        // BMW 2019 Stock Value 652980.0
         //```


         //Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations. */

/*class main{}
class SyntaxTechnologies {
        class Main {
                String schoolName;
                int batch;
                int year;
                String lastDayOfClass;

                SyntaxTechnologies(){

                }
                SyntaxTechnologies(String schoolName,int batch,int year,String lastDayOfClass){

                }
                void display(){
                        System.out.println(schoolName+batch+year+lastDayOfClass);

                }

        }}*/
/*
class Main {
        String schoolName;
        int batch;
        int year;
        String lastDayOfClass;
        Main(){
                System.out.println(schoolName+batch+year+lastDayOfClass);
        }
        Main(String schoolName,int batch,int year,String lastDayOfClass){
              */
/* this.schoolName=schoolName;
               this.batch=batch;
               this.year=year;
               this.lastDayOfClass=lastDayOfClass;*//*

                System.out.println(schoolName+batch+year+lastDayOfClass);
        }


}
*/


/*class Main{141
public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
        }
protected  static String maxLength(String [] arr){

        String LongestString=arr[0];
        for(int i=0; i<arr.length; i++)
        {
        if (arr[i].length()>LongestString.length())
        LongestString=arr[i];

        } return LongestString;
            //System.out.println(arr[maxLength]);
        }

        }*/

        /*   public static String findLongestName(String [] names){
        int size = names.length;
        String longestName = names[0];

        for(int i = 0; i <= 3; i++){
            if(names[i].length() > longestName.length()){
            longestName = names[i];
        }}*/
/*class Main {//137
    String name;
    String city;
    String nameOfSchool;
    int batchNumber;




    static void display(String name,String city,String nameOfSchool,int batchNumber ){
        System.out.println("My name is "+name+ " and I live in "+
                city+". I study at"+nameOfSchool+" in batch "+ batchNumber);
    }
    public static void main(String[] args){
        display("John","Miami","Syntax",9);

    }*/


/*class Main{137
   // class Main {

        static int countVowels(String s) {//134
           int count=0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                {count++;}

            }return count;



        }

        //test case below (dont change):
        public static void main(String[] args){
            System.out.println(countVowels("obama")); //3
            System.out.println(countVowels("happy friday! i love weekends")); //9
        }
    }*/

/*public static void main(String[] args) {132
        int[][] a = {
        {1, 2, 3, 4},
        {4, 5, 6, 7},
        {1, 3, 5, 7}
        };
        a = reduce10(a);
        //print the elements from new array
        }

//create method reduce10 here
static int[][] reduce10(int[][] arr) {
        for (int[] i : arr) {
        for (int j : i) {
        System.out.print((j - 10) + " ");
        }
        System.out.println();
        }
        return arr;
        }
        }*/
/*
class Main {

        public static void main(String[] args) {
            int[][] a = {
                    {1, 2, 3, 4},
                    {4, 5, 6, 7},
                    {1, 3, 5, 7}
            };



                 reduce10(a);
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {

                    System.out.print( a[i][j] );
                }
                System.out.println();


            }}
            static int[][] reduce10 ( int[][] a){
                //create method reduce10 here
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {

                        a[i][j] = a[i][j] - 10;
                    }
                    //System.out.println(" ");

                }
                return a;
            }
        }



*/





    /*public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8




        }
    static final double avgElements(int[] a){
        double d=0.0;
        for(int i=0; i<a.length; i++){
            d=(a[i]+d);
        }
        return d/a.length;
    }
    }*/





//class Main {
  /* static final String reverse(String str){168
        StringBuilder sb=new StringBuilder(str);
        String revstr;
        sb.reverse();
        revstr=sb.toString();
        return revstr;
    }


    public static void main (String[] args){
        String str="hello";
        System.out.println(reverse(str));
    }

}*/
/*
class Main{
public static void main(String[] args) {
        int[][] a = {
        {1,2,3,4},
        {4,5,6,7},
        {1,3,5,7}
        };
        reduce10(a);


        }
static int[][]  reduce10(int[][] a){
        //create method reduce10 here
    int[][] array = new int[0][];
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            array[i][j]=a[i][j];

        }
        System.out.println();

    } return array;
        }


        }

*/


/*
class Main {//130
   static  String thirdLetter(String s){
        StringBuilder sb=new StringBuilder();
        int length=s.length();
        for(int i=0; i<length; i+=3){
            sb.append(s.charAt(i));
        } return sb.toString();

    }


    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}

*/
/*class Main{


    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        mystery(a);
        // should print out 10 1 30 2 50
    }

    static void mystery(int[] array)	{
        for(int i=0; i< array.length; i++){
            if(array[i]%2==0)
                System.out.print(  array[i]/2+ " ");
            if(array[i]%2!=0)
                System.err.print(array[i]*10 + " ");



        }
    }
}
}*/
   // class Main {



        //test case below (dont change):128
       /* public static void main(String[] args){
            String firstValue = mixString("12345","abcde");
            System.out.println(firstValue);
            String secondValue = mixString("howdy","hello");
            System.out.println(secondValue);

        }


        static String mixString(String s1,String s2){
          StringBuilder sb=new StringBuilder();
          int length=s1.length()+s2.length();
            for (int i = 0; i < length; i++) {
                if(i<s1.length()) sb.append(s1.charAt(i));
                if(i<s2.length())sb.append(s2.charAt(i));

            }
        String mix= sb.toString();

            return mix;
        }
    }








*//*


        //test case below (dont change):
        public static void main(String[] args){
            String firstValue = mixString("12345","abcde");
            System.out.println(firstValue);
            String secondValue = mixString("howdy","hello");
            System.out.println(secondValue);

        }


   */
/*  static String mixString(String s1,String s2) {
         String []str1;
         int num = s1.length();
        // for (int i = 0; i <= num; i++) {
             str1 = s1.replace(s1.replace())
         System.out.println(str1);
     }*//*



*/

   /* void print() {
        System.out.println("Programming is amazing.");

    }

        static void printlang(String lang){
            System.out.println(lang+" is awesome.");

        }

    public static void main(String[] args)//replit127
    {
       // System.out.println(print());
        //System.out.println(Main.printlang("Java"));
      //  printlang("Java");


    }}

*/
 /*   int count;
    Main(){
        count+=1;
    }

    public static void main(String[] args){

        Main ob1=new Main();
        Main ob2=new Main();
        Main ob3=new Main();
        System.out.println(ob3.count+ob1.count+ob2.count);

    }

}*/


           /* String name;//122
            String capital;
            int size;

            void display(String name,String capital,int size){
                System.out.println("The capital of "+name+" is "+ capital+" and population is "+size);
            }

        }


        class Tester {
            public static void main (String[] args){
                Main obj1=new Main();
                Main obj2=new Main();
                obj1.display("USA", "Washington", 330000000);
                obj2.display("Kazakhstan", "Astana",18500000 );
            }}

*/