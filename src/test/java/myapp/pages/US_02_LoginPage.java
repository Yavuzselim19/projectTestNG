package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_02_LoginPage {
    public US_02_LoginPage() {
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

    @FindBy(linkText = "Register")
    public WebElement registerButton;

    @FindBy(xpath="//input[@id='reg_username']")
    public WebElement userNameEntry;

    @FindBy(id="reg_email")
    public WebElement userEMailEntry;

    @FindBy(id="reg_password")
    public WebElement passwordEntry;

    @FindBy(id="register-policy")
    public WebElement checkBox;

    @FindBy (xpath="//button[@name='register']")

    public WebElement signUpButton;

    @FindBy (xpath="(//p[@class='submit-status'])[2]")
    public WebElement submitStatusMessage;





}