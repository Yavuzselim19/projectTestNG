package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingDetailsPage {
    public BillingDetailsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id = "billing_first_name")
    public WebElement billingFirstName;

    @FindBy(id = "billing_last_name")
    public WebElement billingLastName;

    @FindBy(id = "billing_company")
    public WebElement billingCompany;

    @FindBy(id = "billing_country")
    public WebElement billingCountryDropDown;

    @FindBy(id = "billing_address_1")
    public WebElement billingAddress1;

    @FindBy(id = "billing_address_2")
    public WebElement billingAddress2;

    @FindBy(id = "billing_city")
    public WebElement billingCity;

    @FindBy(id = "billing_state")
    public WebElement billingStateDropDown;

    @FindBy(id = "billing_postcode")
    public WebElement billingPostcode;

    @FindBy(id = "billing_phone")
    public WebElement billingPhone;

    @FindBy(id = "billing_email")
    public WebElement billingEmail;

    @FindBy(id = "ship-to-different-address-checkbox")
    public WebElement shipToDifferentAddress;

    @FindBy(id = "order_comments")
    public WebElement orderComments;

    @FindBy(id = "payment_method_bacs")
    public WebElement wireTransferEFT;

    @FindBy(id = "payment_method_cod")
    public WebElement payAtTheDoor;

    @FindBy(id = "place_order")
    public WebElement placeOrder;
}
