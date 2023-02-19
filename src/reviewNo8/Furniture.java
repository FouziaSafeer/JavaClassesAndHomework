package reviewNo8;

public class Furniture {


    public void assemble() {
        System.out.println("Furniture need to be assemble");
    }

    public void comfort() {
        System.out.println("Furniture needs to be comfortable");
    }

    private void use(){
        System.out.println("Furniture is used by humans");
    }

  public static void breaks(){
      System.out.println("Furniture Breaks");

  }
}

class Chairs extends Furniture {


   // @Override we cannot overrride static methos
    public static void breaks(){
        System.out.println("Chair can breaks too");
    }
    private void use(){// we are not overriding method use here
        System.out.println("Chairs is used by humans to sit ");
    }
    public void comfort() {//overriding
        System.out.println("Not every chair is comfortable");
    }

    protected void LoveSeat() {//its own method
        System.out.println("this is the best chair");
    }

}
class Table extends Furniture{
    public void comfort(){//override
        System.out.println("Table cannot be comfortable ");
    }
    protected void buildTable(){// its own function
        System.out.println("WE can easily build table");
    }


    void buildTable(String material){
        System.out.println("We build table from "+material);
    }
}
