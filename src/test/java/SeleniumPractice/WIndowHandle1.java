package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class WIndowHandle1 {
    @Test
    public void windowHandlePractice1() throws Exception {
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
        //first window handle string data
        String firstwindowhandle = driver.getWindowHandle();

        WebElement firsttext = driver.findElement(By.xpath("//h5[text()='Click and Confirm new Window Opens']"));
        System.out.println("WebElement text is : " + firsttext.getText());
        //getting two windows on browser
        driver.findElement(By.xpath("//span[text()='Open']")).click();
        Thread.sleep(2000);
        // Getting two windowhandles
        Set<String> windowhandles = driver.getWindowHandles();

        //Switch driver control to second window
        for (String ecwindow : windowhandles) {
            if (driver.switchTo().window(ecwindow).getCurrentUrl().equals("https://www.leafground.com/dashboard.xhtml")) {
                break;
            }
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
        Thread.sleep(2000);

        //closing second window
        driver.close();

        //control to first window
        driver.switchTo().window(firstwindowhandle);

        //first window title
        System.out.println("First window title is : " + driver.getTitle());
        System.out.println("First window url is : " + driver.getCurrentUrl());

        Thread.sleep(5000);

        //closing first window
        driver.close();
    }
}
