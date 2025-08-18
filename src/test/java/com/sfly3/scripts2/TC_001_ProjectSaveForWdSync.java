package com.sfly3.scripts2;

import com.sfly3.base.Browser;
import com.sfly3.helper.ExcelData;
import com.sfly3.pages.HomePage;
import com.sfly3.pages.SignInPage;
import org.testng.annotations.Test;

public class TC_001_ProjectSaveForWdSync extends Browser {
    @Test(dataProvider = "getTestData",dataProviderClass = ExcelData.class)
    public void thirdProjectSave(String email,String password) throws Exception {
        driver.get(p.getProperty("sflysprod2URL"));
        SignInPage signin = new SignInPage(driver);
        signin.SignIn(email,password);
        Thread.sleep(5000);
        HomePage hp = new HomePage(driver);
        hp.clickMyProjects();
    }
}
