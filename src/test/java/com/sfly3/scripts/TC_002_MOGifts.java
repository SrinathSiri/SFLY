package com.sfly3.scripts;

import com.sfly3.base.Browser;
import com.sfly3.helper.ExcelData;
import com.sfly3.pages.HomePage;
import com.sfly3.pages.SignInPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_002_MOGifts extends Browser {
    @Test(dataProvider="getTestdata",dataProviderClass = ExcelData.class, groups = {"Regression","Master"})
    public void mouseoverGifts(String email,String passwrd) throws Exception {
        driver.get(p.getProperty("sflyprod3URL"));
        SignInPage obj = new SignInPage(driver);
        obj.SignIn(email,passwrd);
        HomePage obj1 = new HomePage(driver);
        obj1.mouseover_Gifts(driver,"Travel Mugs");
    }
}
