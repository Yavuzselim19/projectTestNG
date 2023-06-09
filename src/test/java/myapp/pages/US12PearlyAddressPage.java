package myapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US12PearlyAddressPage {
    public US12PearlyAddressPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="billing_first_name")
    public WebElement vendorFirstName;
    @FindBy(id = "billing_last_name")
    public WebElement vendorLastName;
    @FindBy(id ="billing_country")public WebElement vendorCountryDropDown;
    @FindBy(id = "billing_address_1") public WebElement vendorStreet;
    @FindBy(id ="billing_address_2") public WebElement vendorApartmentNumber;
    @FindBy(id = "billing_city") public WebElement vendorCity;
    @FindBy(id ="billing_postcode") public WebElement vendorPostCode;
    @FindBy(id = "billing_phone") public WebElement vendorPhone;
    @FindBy(id = "billing_email") public WebElement vendorEmail;
    @FindBy(id ="billing_company")public WebElement vendorCompany;
}
