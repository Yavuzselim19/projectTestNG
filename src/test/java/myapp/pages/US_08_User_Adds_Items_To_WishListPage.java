package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_08_User_Adds_Items_To_WishListPage {

    public US_08_User_Adds_Items_To_WishListPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "reg_username")
    public WebElement usernameTestBox;

    @FindBy(id = "reg_email")
    public WebElement emailTextBox;

    @FindBy(id = "reg_password")
    public WebElement passwordTextBox;

    @FindBy(id = "register-policy")
    public WebElement registerPolicyButton;

    @FindBy(name = "register")
    public WebElement registerButton;

    @FindBy(xpath = "//span[text()='Sign Out']")
    public WebElement signOutButton;

    @FindBy(linkText = "Addresses")
    public WebElement addressesButton;

    @FindBy(xpath = "(//*[text()='Add'])[2]")
    public WebElement addButton;

    @FindBy(id = "shipping_first_name")
    public WebElement shippingFirstnameTextBox;

    @FindBy(id = "shipping_last_name")
    public WebElement shippingLastnameTextBox;

    @FindBy(id = "shipping_company")
    public WebElement shippingCompanyTextBox;

    @FindBy(id = "select2-shipping_country-container")
    public WebElement shippingCountryContainer;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement shippingCountryTextBox;

    @FindBy(id = "shipping_address_1")
    public WebElement shippingAddressLine1;

    @FindBy(id = "shipping_address_2")
    public WebElement shippingAddressLine2;

    @FindBy(id = "shipping_city")
    public WebElement shippingCityTextBox;

    @FindBy(xpath = "//span[@aria-label='State']")
    public WebElement stateTextBox;

    @FindBy(id = "shipping_postcode")
    public WebElement shippingPostCodeTextBox;

    @FindBy(xpath = "//button[@class='btn btn-dark btn-rounded btn-sm'] [@type='submit']")
    public WebElement SaveAddressButton;


}
