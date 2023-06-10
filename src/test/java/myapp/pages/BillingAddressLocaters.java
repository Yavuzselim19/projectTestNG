package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAddressLocaters {
    public BillingAddressLocaters() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//span[text()='Sign In']")
    public WebElement SignInLink;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement billing_username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement billing_password;

    @FindBy(xpath = "//*[@value='Sign In']")
    public WebElement signInButton;


    @FindBy(xpath ="//a[@href='https://pearlymarket.com/my-account-2/']")
    public WebElement myAccount;

    @FindBy(xpath="//a[@href='https://pearlymarket.com/my-account-2/edit-address/billing/']")
    public WebElement billingAddressADD;

    @FindBy(id = "billing_first_name")
    public WebElement billingFirstName;

    @FindBy(id = "billing_last_name")
    public WebElement billingLastName;

    @FindBy(xpath = "//*[@id = 'billing_company']")
    public WebElement billingCompany;

    @FindBy(xpath = "//*[@id = 'select2-billing_country-container']")
    public WebElement billingCountryRegion;

    @FindBy(xpath = "//*[@id = 'billing_address_1']")
    public WebElement billingAddress1;

    @FindBy(id = "billing_address_2")
    public WebElement billingAddress2;

    @FindBy(id = "billing_city")
    public WebElement billingCity;

    @FindBy(id = "select2-billing_state-container")
    public  WebElement billingState;

    @FindBy(id = "billing_postcode")
    public WebElement billingPostcode;

    @FindBy(id = "billing_phone")
    public WebElement billingPhone;

    @FindBy(xpath = "//*[@value = 'keylinnnnnnnn.enea@fullangle.org']")
    public WebElement billingEmailAddress;


  /*  public void BillingCountryContainer(String country ) {

       billingCountryRegion.click();
        WebElement countryOption = Driver.getDriver().findElement(By.xpath("(//*[@class= 'select2-selection__rendered'])[1]"));

        countryOption.click();

    }

    public void billingStateContainer(String country){

        WebElement stateOption= Driver.getDriver().findElement(By.id("select2-billing_state-container"));
    }
*/

}
