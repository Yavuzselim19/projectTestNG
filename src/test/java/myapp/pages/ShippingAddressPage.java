package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressPage {

    public ShippingAddressPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath ="(//a[@href='https://pearlymarket.com/my-account-2/'])[1]")
    public WebElement myAccount;

    @FindBy(xpath = "//a[@href='https://pearlymarket.com/my-account-2/edit-address/']")

    public WebElement addressesButton;

    @FindBy(xpath="//a[@href='https://pearlymarket.com/my-account-2/edit-address/shipping/']")
    public WebElement editYourShippingAddress;

    @FindBy(xpath="//input[@id='shipping_first_name']")
    public WebElement shippingFirstName;
    @FindBy(xpath="//input[@id='shipping_last_name']")
    public WebElement shippingLastName;
    @FindBy(xpath="//input[@id='shipping_company']")
    public WebElement shippingCompany;

    @FindBy(id="select2-shipping_country-container")
    public WebElement ShippingCountryRegion;

    @FindBy(id="shipping_address_1")
    public WebElement ShippingAddress1;

    @FindBy(id="shipping_address_2")
    public WebElement ShippingAddress2;

    @FindBy(id="shipping_postcode")
    public WebElement ShippingPostCode;

    @FindBy(id="shipping_city")
    public WebElement ShippingCity;

    @FindBy(id="select2-shipping_state-container")
    public WebElement ShippingState;


    @FindBy(xpath="//*[@name='save_address']")

    public WebElement SaveAddress;

    @FindBy(id="main")
    public WebElement ShippingRegistrationMessage;

    @FindBy(name="save_address")
    public WebElement saveAddress;

    public void selectShippingCountryRegion(String country) {
        ShippingCountryRegion.click();
        WebElement countryOption = Driver.getDriver().findElement(By.id("select2-shipping_country-container"));
        countryOption.click();

    }

    public void selectShippingState(String country){
        WebElement stateOption= Driver.getDriver().findElement(By.id("select2-shipping_state-container"));
    }


}