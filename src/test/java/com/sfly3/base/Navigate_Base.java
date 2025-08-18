package com.sfly3.base;

import org.openqa.selenium.WebDriver;

public class Navigate_Base extends Browser{

    public void navigatemySavedProjects(WebDriver driver) throws Exception{
        driver.navigate().to("https://www.shutterfly.com/mySavedProjects");
        Thread.sleep(5000);
    }
}
