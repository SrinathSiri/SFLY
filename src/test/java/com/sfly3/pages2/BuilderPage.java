package com.sfly3.pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuilderPage {
    public BuilderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//div[@id='projectTitleContainer']/a")
    private WebElement saveBuilderPage1 = null;

    @FindBy(xpath ="//a[@id='saveExistingModalButton2']")
    private WebElement saveBuilderPage2 = null;

    public void clickSaveBuilderPage() throws Exception{
        saveBuilderPage1.click();
        saveBuilderPage2.click();
        Thread.sleep(3000);
    }



}
