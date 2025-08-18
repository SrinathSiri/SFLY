package com.sfly3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    public SignUpPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement txtFirstName = null;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement txtLastName = null;

    @FindBy(xpath = "//input[@id='email']")
    WebElement txtEmailAddress = null;

    @FindBy(xpath = "//input[@id='password']")
    WebElement txtPassword = null;

    @FindBy(xpath = "//button[@id='signUpButton']")
    WebElement ButtonsignUp = null;

    public void createAccount(String FirstName,String LastName,String EmailAddress,String Password){
        txtFirstName.sendKeys(FirstName);
        txtLastName.sendKeys(LastName);
        txtEmailAddress.sendKeys(EmailAddress);
        txtPassword.sendKeys(Password);
        ButtonsignUp.click();
    }
}
