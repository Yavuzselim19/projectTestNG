package myapp.pages;

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




}
