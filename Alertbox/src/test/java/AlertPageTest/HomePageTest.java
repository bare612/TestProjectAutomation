package AlertPageTest;

import AlertPages.HomePage;
import common.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {
    HomePage homePage;
    public HomePageTest(){
    }
    @BeforeMethod
    public void setUp(){
         homePage = new HomePage(driver);
    }
    @Test(priority = 1)
    public void HomePageTitleTest(){
       String title = homePage.validateHomePageTitle();
        Assert.assertEquals(title,"Practice Page");
    }
    @Test(priority = 3)
    public void VerifyAutoCompleteBoxTest(){
       String text= homePage.autoComplete();
       Assert.assertEquals(text,"Somalia");
    }
    @Test(priority = 2)
    public void   VerifyRadioBtnTest(){
     homePage.validateRadioBtn();
     Assert.assertTrue(true,"isSelected");
    }
    @Test(priority = 4)
    public void VerifyDropBoxTest(){
        homePage.validateDropBox();
        Assert.assertTrue(true,"isSelected");
    }
    @Test(priority = 5)
    public void verifyCheckboxTest(){
        homePage.validateCheckbox();
        Assert.assertTrue(true,"isSelected");
    }
    @Test(priority = 6)
    public void childWindowTest() {
      String childPageTile=  homePage.validateOpenWindowBtn();
      Assert.assertEquals(childPageTile,"QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");

    }
    @Test(priority = 7)
    public void openTabBtnTest(){
        String pageTitle=homePage.validateOpenTabBtn();
        Assert.assertEquals(pageTitle,"Rahul Shetty Academy");
    }
    @Test(priority = 8)
    public void alertBtnTest(){
       String text= homePage.alertInputBox();
       Assert.assertEquals(text,"Hello User, share this practice page and share your knowledge");
    }
    @Test(priority = 9)
    public void confirmBtnTest(){
       String confirmText= homePage.confirmBtn();
       Assert.assertEquals(confirmText,"Hello , Are you sure you want to confirm?");

    }
    @AfterMethod
    public void cleanUp(){
        driver.close();
    }


    }

