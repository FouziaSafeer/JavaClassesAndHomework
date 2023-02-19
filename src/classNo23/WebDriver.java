package classNo23;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openURL(){
        System.out.println("opening a url");
    }
    public void testLoginPage(){
        System.out.println("checking if login page works");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting google chrome");
    }

    @Override
    public void openURL() {
        System.out.println("Opening in google chrome url ");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login in page in chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the google chrome");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Safari browser");


    }

    @Override
    public void openURL() {
        System.out.println("Opening Safari browser");

    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Safari");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari browser");

    }
}
class FireFox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Firefox");
    }

    @Override
    public void openURL() {
        System.out.println("Opening FireFox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing in FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing FireFox");
    }
}
