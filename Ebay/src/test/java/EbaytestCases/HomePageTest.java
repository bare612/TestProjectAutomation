package EbaytestCases;

import EbayPages.EbayhomePage;
import common.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {
  EbayhomePage homePage;
    public HomePageTest(){
    }
    @BeforeMethod
    public void setUp(){
        homePage = new EbayhomePage(driver);
    }
    @Test(priority = 1)
    public void HomePageTitleTest()throws Exception{
     String title=homePage.validateHomePageTitle();
     Assert.assertEquals(title,"Electronics, Cars, Fashion, Collectibles & More | eBay");
    }
    @Test(priority = 2)
    public void  ebayLogoImageTest(){
       boolean Image = homePage.validateEbayLogo();
       Assert.assertTrue(true,"Image");
    }
    @Test(priority = 3)
    public void InputBoxTest(){
     homePage.text_box();
    }
    @Test(priority = 4)
    public void SearchBoxTest(){
       homePage.searchBtn();
    }
    @Test(priority = 5)
    public void DropBoxTest(){
     String text=homePage.DropdownLink();
     Assert.assertTrue(true);
    }
    @Test(priority = 6)
    public void MotorPageLinkTest(){
       homePage.clickOnEbayMotorsPage();
    }
    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

}
