package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PearlyVendorLoginPage {
    public PearlyVendorLoginPage() { PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='username']")
    public WebElement vendorUserName;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement vendorPassword;

    @FindBy(xpath = "//span[.='Sign In']")
    public  WebElement signInButtonLink;

    @FindBy(xpath = "//button[.='Sign In']")
    public WebElement signInButton;

    @FindBy(id = "rememberme")
    public WebElement chekBoxs;

}

