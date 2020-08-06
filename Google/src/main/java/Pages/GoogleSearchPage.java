package Pages;

import common.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage extends CommonAPI {
    public GoogleSearchPage(WebDriver driver){
      //  this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="q")
    WebElement textinputField;

    @FindBy(className="gb_g")
    WebElement gmailTab;

    public  void   textInputBox(){
        textinputField.click();
     textinputField.sendKeys("Apple Mac 13", Keys.ENTER);
    }
    public void  getGmailLink(){
        gmailTab.click();
    }
}

