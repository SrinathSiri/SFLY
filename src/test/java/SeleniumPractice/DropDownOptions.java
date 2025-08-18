package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class DropDownOptions {
    @Test
    public void dropDownOptions(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0gbeysimsopk81b0umsujerufh8953239.node0");
        WebElement dropdownele = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select selectdp = new Select(dropdownele);
        List<WebElement> dpdnoptions = selectdp.getOptions();
        for(WebElement ecopt:dpdnoptions){
            System.out.println(ecopt.toString());
        }


    }
}
