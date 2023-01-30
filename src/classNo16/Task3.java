package classNo16;

public class Task3 {
    //palindrome abba
    //return type =>>void
    // method name =>>isPalindrom
    //pareameter=>> string input str
    //{reverse string and original string id same e.g dad true cba false
    // }


void ispalindrom(String str){

    StringBuilder st=new StringBuilder(str);
    st.reverse();
    String strrsed  = st.toString().toLowerCase();//builder to string again //save in this string



    if(str.equals(strrsed)){
        System.out.println(str+"is palindrom");
    }else {
        System.out.println(str+" Not is palindrom");
    }

}





    public static void main(String[] args) {



    Task3 task3=new Task3();
    task3.ispalindrom("Madam");// we cannot save this in string as its void n no return type
      //  System.out.println(task3.ispalindrom("Aba")); also not possible as no return
      //  task3.ispalindrom(); paprameter needed


    }

}
