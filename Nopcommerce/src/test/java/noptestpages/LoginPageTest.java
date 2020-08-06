package noptestpages;

import common.CommonAPI;
import noppages.DashboardPage;
import noppages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends CommonAPI {
    LoginPage loginPage;
    public LoginPageTest(){
    }
    @BeforeMethod
    public void setUp(){
        loginPage= new LoginPage(driver);
    }
    @Test(priority = 1)
    public void LoginPageTitleTest(){
     String Title =   loginPage.getLoginPageTitle();
        Assert.assertEquals(Title,"Your store. Login");
    }
    @Test(priority = 2)
    public void EmailInput_FieldTest(){
        loginPage.getEmailBox();
    }
    @Test(priority = 3)
    public void PasswordInput_FieldTest(){
        loginPage.getPasswordBox();
    }
    @Test(priority = 4)
    public void VerifyLoginBtnTest(){
        loginPage.getLoginBtn();
    }
    @Test(priority = 5)
    public void VerifyDashboardPageTest(){
        loginPage.getDashboardPage();
    }
    @Test(priority = 6)
    public void DashboardTitle(){
       String Title= loginPage.getDashboardPageTitle();
       Assert.assertEquals(Title,"Dashboard / nopCommerce administration");
    }
    @Test(priority = 7)
    public void NopCommerceLogoTest() {
        boolean Logo = loginPage.getNopCommerceLogo();
        Assert.assertTrue(true, "Logo");
    }
    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

}
