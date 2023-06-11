package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BecomeVendorPage {

    public BecomeVendorPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "user_email")
    public WebElement email;

    @FindBy (name = "wcfm_email_verified_input")
    public WebElement verificationCode;

    @FindBy (name = "wcfm_email_verified_button")
    public WebElement reSendCode;

    @FindBy (id = "passoword")
    public WebElement password;

    @FindBy (id = "confirm_pwd")
    public WebElement confirmPassword;

    @FindBy (name = "save-data")
    public WebElement registerButton;

    @FindBy (css = "span[class='wcicon-status-completed']")
    public static WebElement verificationText;












}
