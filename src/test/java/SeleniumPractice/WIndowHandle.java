package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class WIndowHandle {
    @Test
    public void windowHandlePractice() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/");
        driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Window']")).click();
        Thread.sleep(2000);
        WebElement firsttext = driver.findElement(By.xpath("//h5[text()='Click and Confirm new Window Opens']"));
        System.out.println("WebElement text is : " + firsttext.getText());
        String firsthandletext = firsttext.getText();

        if (firsthandletext.equals("Click and Confirm new Window Opens")) {
            driver.findElement(By.xpath("//span[text()='Open']")).click();
            System.out.println("Window handle open button clicked");
        } else {
            System.out.println("First Window Handle Text not matched");
        }

        Set<String> windowhandles = driver.getWindowHandles();

        //Switch driver control to second window
        for(String ecwindow:windowhandles){
            if(driver.switchTo().window(ecwindow).getCurrentUrl().equals("https://www.leafground.com/dashboard.xhtml")){
                break;
            }
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
    }


}
