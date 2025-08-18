package com.sfly3.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Alert_Base extends Browser{

    public void alert_accept(WebDriver driver){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
