package EbayPages;

import common.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EbayhomePage extends CommonAPI {
    public EbayhomePage(WebDriver driver){
      //  this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(id="gh-ac")
    WebElement InputBox;

    @FindBy(id="gh-btn")
    WebElement Searchbox;

    @FindBy(id="gh-cat")
    WebElement Dropbox;

    @FindBy(id="gh-logo")
    WebElement EbayLogo;

    @FindBy(linkText = "Motors")
    WebElement motorsLink;

 public String validateHomePageTitle(){
     return driver.getTitle();
 }
 public boolean validateEbayLogo(){
    return EbayLogo.isDisplayed();
 }
 public void text_box(){
     InputBox.click();
     InputBox.sendKeys("Seiko Watch");
     Searchbox.click();
 }
 public void searchBtn(){
      Searchbox.click();
 }
 public String DropdownLink(){
     Select select=new Select(Dropbox);
     select.selectByVisibleText("Art");
     String text=Dropbox.getText();
     return text;
 }
  public EbayMotorsPage clickOnEbayMotorsPage() {
      motorsLink.click();
     return new EbayMotorsPage(driver);

  }
     }






