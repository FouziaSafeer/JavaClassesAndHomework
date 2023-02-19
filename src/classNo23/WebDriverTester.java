package classNo23;

public class WebDriverTester {
    public static void main(String[] args) {

       // WebDriver webDriver=new Chrome();
       // WebDriver webDriver=new Safari();
       //FireFox firefox=new WebDriver(); downcasting , non premitive does not work

        WebDriver[] browsers={ new Chrome(),new Safari(),new FireFox()};
          //  WebDriver [] br1={ chrome,firefox,safari}
        WebDriver webDriver=new FireFox();
for(WebDriver Browsers1 :browsers){////to see all browser// dynamics poly morphices

    Browsers1.startBrowser();
    Browsers1.openURL();
    Browsers1.testLoginPage();
    Browsers1.closeBrowser();
    System.out.println("________________________");
}


      //  Chrome googleChorom=new Chrome();

        /*googleChorom.startBrowser();
        googleChorom.openURL();
        googleChorom.testLoginPage();
        googleChorom.closeBrowser();
*/

        //code repetition
        //inreal life calling lots of 100 of methods
        //
     /*   System.out.println("_____________________________");
        Safari safariBrowser=new Safari();
        safariBrowser.startBrowser();
        safariBrowser.openURL();
        safariBrowser.testLoginPage();
        safariBrowser.closeBrowser();
        System.out.println("_____________________________");
        FireFox firefox=new FireFox();
        firefox.startBrowser();
        firefox.openURL();
        firefox.testLoginPage();
        firefox.closeBrowser();*/
    }
}
