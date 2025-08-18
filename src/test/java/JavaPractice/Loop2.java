package JavaPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loop2 {
    public static void main(String[] args){
        System.out.println("Start");
        String browser = "firefox";
        while(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.google.com");
            driver.close();
            break;
        }
        System.out.println("End");
    }
}
