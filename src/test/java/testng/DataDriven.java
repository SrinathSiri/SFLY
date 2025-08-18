package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class DataDriven {
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

    public void sflyLogin(String username,String password) {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
    }

    @Test(dataProvider = "getTestData")
    public void sflyMyProjects(String username,String password) throws Exception {
        sflyLogin(username,password);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='Projects']")));
        driver.findElement(By.xpath("//p[text()='Projects']")).click();
        Thread.sleep(3000);
        sflyLogOut();
    }

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

    @DataProvider(name="getTestData")
    public String[][] getTestData(){
        String[][] data = {{"john.sample@gmail.com","Gudeat18@"},{"cart.user.1280991822092@shutterfly.com","sfqatest"}};
        return data;
    }

}
