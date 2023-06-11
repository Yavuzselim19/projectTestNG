package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(name = "rememberme")
    public WebElement rememberMe;

    @FindBy(name = "login")
    public WebElement loginButton;

    @FindBy(linkText = "Become a Vendor")
    public WebElement becomeVendor;
}
