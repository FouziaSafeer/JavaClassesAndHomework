package reviewNo8;

public class Store {
    public static void main(String[] args) {
       Furniture chair= new Chairs();
       chair.assemble();// in run time it will look child if not in choild go to parent
       chair.comfort();// run time java decide which to access
        Furniture table= new Table();
        table.comfort();//runtime polymorphirsm
        table.assemble();
        Table t= new Table();
        t.comfort();
        t.assemble();
        t.buildTable("wood");
        Chairs.breaks();
        Furniture.breaks();//static method call by class name
        chair.breaks();//since we are not over riding methods break will be executed
      //  from parent class, plus this is not rigjht way tio call static method
    }
}
