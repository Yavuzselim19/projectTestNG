package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesPage {
    public AddressesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[text()='Add'])[1]")
    public WebElement addBillingAddress;

    @FindBy(xpath = "(//a[text()='Add'])[2]")
    public WebElement addShippingAddress;

    @FindBy(linkText = "Edit Your Billing Address")
    public WebElement editYourBillingAddress;

    @FindBy(linkText = "Edit Your Billing Address")
    public WebElement editYourShippingAddress;

    @FindBy(xpath = "//button[@name='save_address']")
    public WebElement saveBillingAddress;
}
