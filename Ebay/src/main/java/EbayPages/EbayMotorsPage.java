package EbayPages;

import common.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EbayMotorsPage extends CommonAPI {
    public EbayMotorsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Find Parts for My Vehicles')]")
    WebElement findPartsLink;

    @FindBy(xpath = "//a[contains(text(),'Cars & Trucks')]")
    WebElement carsAndTrucks;

    @FindBy(xpath = "//a[contains(text(),'Classic Cars')]")
    WebElement classicCarsLink;

    @FindBy(xpath = "//a[contains(text(),'Collector Cars')]")
    WebElement collectorCarsLink;

    public String MotorPageTitle(){
      return driver.getTitle();
    }
    public void  findPartsLinkTab(){
      findPartsLink.click();
    }
    public void  carsAndTrucksLink(){
       carsAndTrucks.click();
    }
    public void  classicCarsLinkTab(){
       classicCarsLink.click();
    }
    public void collectorCarsLinkTab(){
       collectorCarsLink.click();
    }

}

