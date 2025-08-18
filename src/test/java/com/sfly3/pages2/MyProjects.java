package com.sfly3.pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProjects {

    public MyProjects(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[@class='dropDownContainer']")
    private WebElement category_dpdn = null;

    public void clickCategoryDpDn(){
        category_dpdn.click();
    }

    @FindBy(xpath = "(//div[@class='uig-tooltip-dropdown-menu anchor-right']/ul/li/span[2])[2]")
    private WebElement catedpdn_PhotoGifts = null;

    public void clickPhotoGiftsFromCategoryDpDn(){
        catedpdn_PhotoGifts.click();
    }

    @FindBy(xpath="(//div[@class='responsive-my-projects']/div[3])//a/div/img")
    private WebElement photoGiftsThirdThumbnail = null;

    public void clickPhotoGiftsthirdThumbnail(){
        photoGiftsThirdThumbnail.click();
    }

}
