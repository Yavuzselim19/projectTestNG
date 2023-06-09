package myapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US12PearlyHomePage {
    public US12PearlyHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Sign In")
    public WebElement signIn;
    @FindBy(xpath = "//span[text() ='Sign Out']")
    public WebElement singOut;
    @FindBy(linkText = "Addresses")
    public WebElement Addresses;
    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement editAddress;
    @FindBy(name = "save_address")public WebElement saveButton;
    @FindBy(linkText = "My Account") public WebElement MyAccount;
    @FindBy(xpath = "(//button[@type='submit'])[2]") public WebElement saveAddressButton;
    @FindBy(xpath = "(//p['The following addresses will be used on the checkout page by default.'])[1]")
    public WebElement addressAdded;

}
