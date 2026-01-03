package JavaPractice;

public class SingletonLaunchBrowser {

    public static void main(String[] args) throws Exception{

        SingletonClass.getDriver().get("https://www.google.com"); // No object creation possible, so using getInstance method called
        SingletonClass.closeBrowser();

    }
}
