package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PearlyVendorHomePage {
    public PearlyVendorHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(css = ".main-content li a")
    public WebElement titles;

    @FindBy(xpath = "//div[@class='main-content']//li//a")
    public List<WebElement> titles2;

    @FindBy(linkText = "My Account")
    public WebElement myAccountText;

    @FindBy(xpath = "//h2[.='My Account']")
    public WebElement myAccountUpp;

    @FindBy(xpath = "//*[@class='submit-status']")
    public WebElement wrongUsernameText;

    @FindBy(partialLinkText = "Store Ma")
    public WebElement storeManager;

    @FindBy(linkText = "Orders")
    public WebElement orders;

    @FindBy(linkText = "Downloads")
    public WebElement downloads;

    @FindBy(linkText = "Addresses")
    public WebElement addresses;

    @FindBy(linkText = "Account details")
    public WebElement accountDetails;

    @FindBy(linkText = "Wishlist")
    public WebElement wishlist;

    @FindBy(partialLinkText ="Support Tic" )
    public WebElement supportTickets;

    @FindBy(partialLinkText = "Followin")
    public WebElement followings;

    @FindBy(linkText = "Logout")
    public WebElement logout;
}


