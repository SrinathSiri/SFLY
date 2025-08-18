package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DropDown1 {
    @Test
    public void dropDownMethod() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
        Thread.sleep(3000);
        WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(iframe1);

        WebElement carsdrdn = driver.findElement(By.xpath("//select[@id='cars']"));
        Select select = new Select(carsdrdn);
        // To know single option selection or multiple option selection
        if (select.isMultiple()) {
            System.out.println("Dropdown has multiple options");
        } else {
            System.out.println("Dropdown has single option");
        }
        // To know each option name
        List<WebElement> listeles = select.getOptions();
        for(WebElement ecopt:listeles){
            System.out.println(ecopt.getText());
            if(ecopt.getText().equalsIgnoreCase("Saab")){
                ecopt.click();
                break;
            }
        }

    }
}
