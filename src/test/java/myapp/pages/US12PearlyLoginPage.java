package myapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US12PearlyLoginPage {
    public US12PearlyLoginPage(){
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
}
