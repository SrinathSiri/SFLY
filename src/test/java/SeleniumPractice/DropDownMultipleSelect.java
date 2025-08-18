package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class DropDownMultipleSelect {
    @Test
    public void dpdwnMultipleSelect() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
        //switch driver to framed page
        driver.switchTo().frame("iframeResult");
        WebElement selectdp = driver.findElement(By.xpath("//select[@id='cars']"));
        Select select = new Select(selectdp);
        System.out.println("Multiple selection dropdown : " + select.isMultiple());
        Thread.sleep(2000);

        List<WebElement> alloptions = select.getOptions();
        for (WebElement ecoption : alloptions) {
            System.out.println("Cars : " + ecoption.getText());
            if (ecoption.getText().equalsIgnoreCase("Saab")) {
                ecoption.click();
                break;
            }
        }
        //driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        select.selectByValue("opel");
        Thread.sleep(2000);
        select.selectByVisibleText("Volvo");
        Thread.sleep(2000);
        System.out.println("Selected Options count is : " + select.getAllSelectedOptions().size());
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        for (WebElement ecselected : selectedOptions) {
            System.out.println("Selected Option Name is : " + ecselected.getText());
        }
        //deselect saab option by value
        for(WebElement ecopt:selectedOptions){
            if(ecopt.getText().equalsIgnoreCase("Saab")){
                select.deselectByValue("saab");
                break;
            }
        }
        Thread.sleep(2000);
        select.deselectByVisibleText("Volvo");
        Thread.sleep(2000);
        select.deselectByIndex(2);
        Thread.sleep(2000);
        select.selectByIndex(3);
        Thread.sleep(2000);
        //Deselect All
        select.deselectAll();
    }
}
