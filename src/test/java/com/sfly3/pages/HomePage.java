package com.sfly3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[text()='Projects']")
    private WebElement linkMyProjects = null;

    public void clickMyProjects() {

        linkMyProjects.click();
    }

    @FindBy(xpath = "(//span[text()='Gifts'])[1]")
    private WebElement moGifts = null;

    @FindBy(xpath = "(//p[text()='Ceramic Mugs'])[1]")
    private WebElement moGifts_ceramicmugs = null;

    @FindBy(xpath = "(//div[@class='sfly-lib-my-5 sfly-lib-grid sfly-lib-grid-cols-5 sfly-lib-gap-4'])[3]//div[2]//ul//li//a")
    private List<WebElement> moGifts_drinkwareOptions = null;

    public void mouseover_Gifts(WebDriver driver, String product) throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(moGifts).build().perform();
        Thread.sleep(3000);
        // action.click(moGifts_ceramicmugs).build().perform();
        for (WebElement ecoption : moGifts_drinkwareOptions) {
            if (ecoption.getText().equalsIgnoreCase(product)) {
                action.click(ecoption).build().perform();
                break;
            }
        }
        Thread.sleep(5000);
    }

}
