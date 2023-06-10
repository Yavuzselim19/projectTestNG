package myapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import myapp.utilities.Driver;

import static org.openqa.selenium.By.xpath;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Sign In")
    public WebElement signIn;

    @FindBy(linkText = "Register")
    public WebElement register;

    @FindBy(xpath = "//input[@aria-label='Search']")
    public WebElement searchInput;

    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement signOut;

    @FindBy(linkText = "Log out")
    public WebElement logOut;

    // LINKS at the bottom page
    @FindBy(linkText = "Cart")
    public WebElement cart;

    @FindBy(linkText = "My Orders")
    public WebElement myOrders;

    @FindBy(linkText = "Wishlist")
    public WebElement wishlist;
    @FindBy(linkText = "My Account")
    public WebElement myAccount;
    @FindBy(xpath="//button[@name='add-to-cart']" )
    public WebElement addToCart;



}
