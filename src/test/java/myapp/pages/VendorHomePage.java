package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorHomePage {

    public VendorHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Sign In']")
    public WebElement signIn;

    @FindBy(id="username")
    public WebElement username;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement submitButton;


}
