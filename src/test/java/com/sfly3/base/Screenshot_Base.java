package com.sfly3.base;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import org.openqa.selenium.WebDriver;

public class Screenshot_Base extends Browser{
    public void captureFullScreen(WebDriver driver){
        Shutterbug.shootPage(driver, Capture.FULL).save("C:\\Users\\v-srinath.sirimalla\\AutomationWorkspace\\SFLY\\screenshot\\ForwardSync\\myprojects2.png");
    }
}
