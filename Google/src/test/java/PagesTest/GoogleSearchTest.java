package PagesTest;

import Pages.GoogleSearchPage;
import common.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchTest extends CommonAPI {
    GoogleSearchPage Gsp;

    public GoogleSearchTest() {

    }

    @BeforeMethod
    public void setUp() {
        Gsp = new GoogleSearchPage(driver);
    }

    @Test
    public void VerifyPageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google","Home page title not Matched");
    }

    @Test
    public void textInputTest() {
        Gsp.textInputBox();
    }

    @Test
    public void gmailLinkTest() {
        Gsp.getGmailLink();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}