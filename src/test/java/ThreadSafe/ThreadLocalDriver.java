package ThreadSafe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ThreadLocalDriver {

    WebDriver driver = null;

    ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();

    public void setDriver(WebDriver driver) {
        tdriver.set(driver);
    }

    public WebDriver getDriver() {
        return tdriver.get();
    }


    @Test
    public void m1_chrome() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        setDriver(driver);
        getDriver().get("https://www.google.com");
        Thread.sleep(2000);
        getDriver().quit();
    }

    @Test
    public void m2_edge() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        setDriver(driver);
        getDriver().get("https://www.bing.com");
        Thread.sleep(2000);
        getDriver().quit();
    }

    @AfterClass
    public void closeDriver(){
        tdriver.remove();
    }
}
