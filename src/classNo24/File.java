package classNo24;

public abstract class File {
    /*
Create a class File that will have the following behaviors: open, edit, close.
Edit and close are implemented method while open is an abstract. Create 3 subclasses: JavaFile,
 WordFile, PdfFile that will provide specific implementation of open behaviour: Example: to open
.java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc*/
    abstract  void open();
    void edit(){
        System.out.println(" It Edit File");
    }
    void close(){
        System.out.println("It close File");
    }
}
class JavaFiles extends File{
    @Override
    void open() {
        System.out.println("Opens java file, in intellij");
    }
    void edit() {
        System.out.println("Editing the file in intellij");
    }
}
class WordFile extends File{
    @Override
    void open() {
        System.out.println("opens Word file, .doc file");

    }



}
class PdfFile extends File{
    @Override
    void open() {
        System.out.println("Opening the file in acrobat reader");
    }
}
class FileTester{
    public static void main(String[] args) {
        File [] file={new PdfFile(),new JavaFiles(),new WordFile()};
        for (File f:file) {
            f.close();
            f.open();
            f.edit();
            System.out.println("--------------");
        }

    }
}
