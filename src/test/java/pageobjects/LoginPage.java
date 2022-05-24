package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public  WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "Email")
    @CacheLookup
    WebElement txtEmail;


    @FindBy(id = "Password")
    @CacheLookup
    WebElement txtPassword;



    @FindBy(xpath = "//button[@type='submit']")
    @CacheLookup
    WebElement btnLogin;


    @FindBy(linkText = "Logout")
    @CacheLookup
    WebElement lnklogout;

    public void enterUserName(String name){
        txtEmail.clear();
        txtEmail.sendKeys(name);
    }
    public void enterPassword(String pass){
        txtPassword.clear();
        txtPassword.sendKeys(pass);
    }
    public void clickLogin(){
        btnLogin.click();
    }
    public void clickLogout(){
        lnklogout.click();
    }

}
