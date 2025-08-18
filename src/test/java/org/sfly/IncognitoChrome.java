package org.sfly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class IncognitoChrome {
    @Test
    public void incognitoChrome(){
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    DesiredCapabilities cap =new DesiredCapabilities();
    cap.setCapability(ChromeOptions.CAPABILITY,options);
    options.merge(cap);

    ChromeDriver driver  = new ChromeDriver(options);
    driver.get("https://www3.stage.shutterfly.com");

    }
}
