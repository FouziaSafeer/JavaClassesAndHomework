package classNo19;

public class Book {
    /*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed*/
    String bookName;
    String bookType;
    int bookNo;

    Book(){

        this.bookNo=2;
    }
    Book(String bookname,String bookType){
        this();
        this.bookName=bookname;
        this.bookType=bookType;
        System.out.println("This book name "+this.bookName+" book type is "+ this.bookType+" this bookno is "+this.bookNo);


    }

    public static void main(String[] args) {
        Book book1=new Book("LionKing","kids");

    }
}/*String name;
    String author;
    int price;
     int pages;

     Book(String name, int price, int pages){
         this.name=name;
         this.price=price;
         this.pages=pages;
     }
     Book(String name,String author, int price, int pages){
         this(name, price, pages);
         this.author =author;
     }

    public static void main(String[] args) {
        Book book1=new Book("Atomic habits",20,298);
        Book book2=new Book("The Gift","Edith Eger",23,256);
        System.out.println(book2.name);
    }
}*/
