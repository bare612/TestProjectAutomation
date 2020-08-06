package AlertPages;

import common.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.Iterator;
import java.util.Set;


public class HomePage extends CommonAPI {

    public HomePage(WebDriver driver){
      //  this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "[name='checkBoxOption1']")
    WebElement checkboxBtn;

    @FindBy(id="autocomplete")
    WebElement autobox;

    @FindBy(css = "[class*='item-wrapper']")
    WebElement newtext;

    @FindBy(id="dropdown-class-example")
    WebElement Dropdownbox;

    @FindBy(xpath = "//input[@value='radio2']")
    WebElement radioBtn;

    @FindBy(id="openwindow")
    WebElement openwindowBtn;

    @FindBy(id="opentab")
    WebElement opentabBtn;

    @FindBy(id="name")
    WebElement inputBox;

    @FindBy(id="alertbtn")
    WebElement alertBtn;

    @FindBy(id="confirmbtn")
    WebElement confirmBtn;

    public String  validateHomePageTitle(){
       return driver.getTitle();
    }
    public String autoComplete(){
       autobox.click();
       autobox.sendKeys("som");
       newtext.click();
        JavascriptExecutor js= (JavascriptExecutor)driver;
        String script="return document.getElementById(\"autocomplete\").value";
        String text = (String) js.executeScript(script);
        return text;
    }
    public boolean validateRadioBtn(){
       radioBtn.click();
        return radioBtn.isSelected();
    }
    public boolean validateDropBox(){
        Select select=new Select(Dropdownbox);
        select.selectByIndex(2);
       return Dropdownbox.isSelected();
    }
    public boolean validateCheckbox(){
        checkboxBtn.click();
        return checkboxBtn.isSelected();
    }
    public String validateOpenWindowBtn(){
        openwindowBtn.click();
     Set<String> windowId = driver.getWindowHandles();
        Iterator<String> it = windowId.iterator();
        String parentId=it.next();
        String childId=it.next();
        driver.switchTo().window(childId);
        String title=driver.getTitle();
        driver.switchTo().window(parentId);
        return title;
    }
    public String validateOpenTabBtn(){
        opentabBtn.click();
        Set<String> tabId= driver.getWindowHandles();
        Iterator<String> it = tabId.iterator();
        String OldTab=it.next();
        String newTab=it.next();
        driver.switchTo().window(newTab);
       String title= driver.getTitle();
        driver.switchTo().window(OldTab);
        return title;
    }
    public String alertInputBox(){
        inputBox.click();
        inputBox.sendKeys("User");
        alertBtn.click();
      String text=  driver.switchTo().alert().getText();
      driver.switchTo().alert().accept();
      return text;
    }
    public String confirmBtn(){
        confirmBtn.click();
       String confirmText = driver.switchTo().alert().getText();
       driver.switchTo().alert().accept();
       return confirmText;
    }


    }


