package myapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import myapp.utilities.Driver;

public class PearlyHomePage {
    public PearlyHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Sign In")
    public WebElement signIn;

    @FindBy(linkText = "Register")
    public WebElement register;

    @FindBy(xpath = "//input[@aria-label='Search']")
    public WebElement searchInput;

    @FindBy(xpath ="(//a[@href='https://pearlymarket.com/my-account-2/'])[1]")
    public WebElement myAccount;

    @FindBy(xpath = "//a[@href='https://pearlymarket.com/my-account-2/edit-address/']")

    public WebElement addressesButton;

    @FindBy(xpath = "https://pearlymarket.com/my-account-2/edit-address/shipping/")

    public WebElement addButton;

    




}
