package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    public RegistrationPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "reg_username")
    public WebElement reg_username;

    @FindBy(id = "reg_email")
    public WebElement reg_email;

    @FindBy(id = "reg_password")
    public WebElement reg_password;

    @FindBy(id = "register-policy")
    public WebElement register_policy;

    @FindBy(name = "register")
    public WebElement signUpButton;

    @FindBy(xpath = "(//p[@class='submit-status'])[2]")
    public WebElement submitStatusMessage;

    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement signOut;

    @FindBy(xpath = "//*[@class='text-uppercase text-center mb-0']")
    public WebElement logOut;





}


