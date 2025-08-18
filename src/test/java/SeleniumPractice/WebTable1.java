package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebTable1 {
    @Test
    public void webTable1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        driver.get("https://datatables.net/");

        // Number of tables in webpage
        int nooftables = driver.findElements(By.tagName("table")).size();
        System.out.println("Number of tables in a webpage is : "+nooftables);

        //number of rows in a table
        int noofrows = driver.findElements(By.xpath("//table[@id='example']//tbody//tr")).size();
        System.out.println("Number of rows in a table is : "+noofrows);

        //number of columns in a table

        int noofcolumns = driver.findElements(By.xpath("//table[@id='example']//thead//th")).size();
        System.out.println("Number of columns in a table is : "+noofcolumns);
    }
}
