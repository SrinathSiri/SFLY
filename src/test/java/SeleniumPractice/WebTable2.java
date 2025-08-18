package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

import java.time.Duration;

public class WebTable2 {
    @Test
    public void webTable2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
        driver.get("https://datatables.net/");
        String tabledata = driver.findElement(By.xpath("//table[@id='example']")).getText();
        System.out.println(tabledata);

        //table header each cell data

        List<WebElement> headercells = driver.findElements(By.xpath("//table[@id='example']//thead//tr//th"));
        for (WebElement eccell : headercells) {
            System.out.println("Each Header Cell data is : " + eccell.getText());
            if (eccell.getText().equalsIgnoreCase("Office")) {
                System.out.println("Office text is : " + eccell.getText());
                break;
            }
        }

        WebElement row3data = driver.findElement(By.xpath("//table[@id='example']//tbody//tr[3]"));
        System.out.println("row3 full data is : " + row3data.getText());

        System.out.println("Total cities count is : " + driver.findElements(By.xpath("//table[@id='example']//tbody//tr//td[3]")).size());
        //table all city names
        List<WebElement> citys = driver.findElements(By.xpath("//table[@id='example']//tbody//tr//td[3]"));
        for (WebElement eccity : citys) {
            System.out.println(eccity.getText());
        }

        //Newyork city count
        int count = 0;
        List<WebElement> nycityct = driver.findElements(By.xpath("//table[@id='example']//tbody//tr//td[3]"));
        for (WebElement nyoccur : nycityct) {
            if (nyoccur.getText().equalsIgnoreCase("New York")) {
                count = count + 1;
            }
        }
        System.out.println("NY city occurance ct is : " + count);
    }
}
