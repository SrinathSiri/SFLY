package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class SflyMyProjLogin {
    private WebDriver driver = null;

    @BeforeTest
    public void sflyBrowserLaunch() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
        driver.get("https://accounts3.shutterfly.com/");
    }

    @BeforeMethod
    public void sflyLogin() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("john.sample@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gudeat18@");
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
    }

    @Test
    public void sflyMyProjects() throws Exception {
        driver.findElement(By.xpath("//p[text()='Projects']")).click();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void sflyLogOut() throws Exception {
        driver.findElement(By.xpath("(//span[@class='sfly-lib-ml-[9.492px] sfly-lib-text-base sfly-lib-font-callout sfly-lib-text-neutrals-black sfly-lib-flex sfly-lib-gap-1.5'])[1]")).click();
        Thread.sleep(5000);
        List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='sfly-lib-w-full sfly-lib-rounded-md sfly-lib-text-xs sfly-lib-leading-none sfly-lib-text-neutrals-black sfly-lib-whitespace-no-wrap sfly-lib-border sfly-lib-border-neutrals-slate-light sfly-lib-bg-neutrals-white sfly-lib-shadow-xl sfly-lib-border-solid sfly-lib-py-3']//child::div/a/p"));
        for (WebElement ecelement : webelements) {
            if (ecelement.getText().trim().equalsIgnoreCase("Sign Out")) {
                Thread.sleep(2000);
                ecelement.click();
                break;
            }
        }
    }

    @AfterTest
    public void sflyCloseBrowser() throws Exception {
        Thread.sleep(3000);
        driver.close();
    }
}
