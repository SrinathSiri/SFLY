package com.sfly3.scripts;

import apchepoi.DataExcel;
import com.sfly3.base.Browser;
import com.sfly3.helper.ExcelData;
import com.sfly3.pages.HomePage;
import com.sfly3.pages.SignInPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_003_LoginSfly3DataProvider extends Browser {
    @Test(dataProvider = "DataTestExcel",dataProviderClass = DataExcel.class)
    public void loginSfly3(String email,String password) throws Exception {
        driver.get(p.getProperty("sflyprod3URL"));
        SignInPage signin = new SignInPage(driver);
        signin.SignIn(email,password);
        Thread.sleep(5000);
        HomePage hp = new HomePage(driver);
        hp.clickMyProjects();
    }

}
