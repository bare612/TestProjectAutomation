package EbaytestCases;

import EbayPages.EbayMotorsPage;
import EbayPages.EbayhomePage;
import common.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MotorPageTest extends CommonAPI {
    EbayhomePage ebayhomePage;
    EbayMotorsPage ebayMotorsPage;

    public MotorPageTest() {
    }
    @BeforeMethod
    public void setUp() {
        ebayMotorsPage = new EbayMotorsPage(driver);
        ebayhomePage = new EbayhomePage(driver);
        ebayhomePage.clickOnEbayMotorsPage();
    }
    @Test(priority = 1)
    public void MotorPageLink() {
        String title = ebayMotorsPage.MotorPageTitle();
        Assert.assertEquals(title, "eBay Motors: Auto Parts and Vehicles | eBay");
    }
    @Test(priority = 2)
    public void findPartsLinkTest() {
        ebayMotorsPage.findPartsLinkTab();
    }
    @Test(priority = 3)
    public void carsAndTrucksLinkTest() {
        ebayMotorsPage.carsAndTrucksLink();
    }
    @Test(priority = 4)
    public void classicCarsLinkTabTest() {
        ebayMotorsPage.classicCarsLinkTab();
    }
    @Test(priority = 5)
    public void collectorCarsLinkTabTest() {
        ebayMotorsPage.collectorCarsLinkTab();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

