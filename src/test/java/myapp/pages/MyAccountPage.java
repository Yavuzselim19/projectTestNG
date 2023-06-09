package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    public MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Dashboard")
    public WebElement dashboard;

    @FindBy(linkText = "Store Manager")
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

    @FindBy(linkText = "Logout")
    public WebElement logOut;


}
