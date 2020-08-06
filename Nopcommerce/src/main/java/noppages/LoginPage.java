package noppages;

import common.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(id="Email")
   public  WebElement emailBox;

    @FindBy(name="Password")
    public WebElement passwordBox;

    @FindBy(css = "input[value='Log in']")
    public  WebElement loginBtn;

    @FindBy(css = "span[class='logo-lg']")
    public WebElement nopCommerceLogo;

    public String getLoginPageTitle(){
       return driver.getTitle();
    }
    public void getEmailBox(){
        emailBox.clear();
        emailBox.sendKeys("admin@yourstore.com");

    }
    public void getPasswordBox(){
        passwordBox.clear();
        passwordBox.sendKeys("admin");

    }
    public void getLoginBtn(){
        loginBtn.click();
    }
     public DashboardPage getDashboardPage(){
        return  new DashboardPage(driver);
     }

     public String getDashboardPageTitle(){
        loginBtn.click();
       return driver.getTitle();
     }
     public boolean getNopCommerceLogo(){
        loginBtn.click();
       return nopCommerceLogo.isDisplayed();

     }



}
