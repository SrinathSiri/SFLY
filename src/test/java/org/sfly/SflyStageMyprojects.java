package org.sfly;

import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class SflyStageMyprojects {
    @Test
    public void sflyStageMyProjectsLoading() throws InterruptedException, Exception {

        WebDriverManager.chromedriver().setup();
        // InCognito Browser Open
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(cap);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
        driver.get("https://www3.stage.shutterfly.com");
        driver.findElement(By.xpath("//div[@id='boxclose']")).click();
        driver.findElement(By.xpath("//p[text()='Sign in']")).click();
        driver.findElement(By.xpath("//span[@class='sfs-button--content'][text()='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("srinathstage6@yopmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("testing123");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[@class='sfs-button--content'][text()='Sign in']")).click();

        try {
            WebElement imagetext = driver.findElement(By.xpath("//img[@class='recapthaImage ']"));
            if (imagetext.isDisplayed()) {
                File src = imagetext.getScreenshotAs(OutputType.FILE);
                File des = new File("C:\\Users\\v-srinath.sirimalla\\AutomationWorkspace\\SFLY\\recpachaimages\\capcha.png");
                FileHandler.copy(src, des);
                Thread.sleep(2000);
                //Tessaract image reading
                ITesseract imageread = new Tesseract();
                String capcha = imageread.doOCR(des);
                System.out.println("Image OCR Done");
                System.out.println("Capcha complete text : " + capcha);

                String actulcapchatxt = capcha.replaceAll("[^a-zA-Z0-9]]", "");
                System.out.println("Actual capcha text after trim: " + actulcapchatxt);
                driver.findElement(By.xpath("//span[@class='sfs-button--content'][text()='Sign in']")).click();
            } else {
                System.out.println("No CAPTCHA detected. Proceeding with normal flow.");
                //driver.findElement(By.xpath("//span[@class='sfs-button--content'][text()='Sign in']")).click();

            }
        } catch (Exception e) {
            System.out.println("Catch Block Exception");
            System.out.println(e.toString());
        }

        //closing marketing popup
        driver.findElement(By.xpath("//div[@id='boxclose']")).click();
        //clicking myprojects
        driver.findElement(By.xpath("//p[text()='Projects']")).click();

        //Browser Close
        driver.close();

    }

}
