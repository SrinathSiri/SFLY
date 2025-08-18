package com.sfly3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement txtEmail = null;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement txtPasswd = null;

    @FindBy(xpath = "(//button[@id='signInButton'])[1]")
    private WebElement btnSignIn = null;

    public void SignIn(String email, String passwd) throws Exception {
        //txtEmail.clear();
        txtEmail.sendKeys(email);
        txtPasswd.sendKeys(passwd);
        btnSignIn.click();
    }

}
