package JavaPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DecisionState1 {
    public static void main(String[] args) {
        String Browser = "chrome";
        WebDriver driver = null;
        System.out.println("Start");

        if (Browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        System.out.println("End");
    }
}
