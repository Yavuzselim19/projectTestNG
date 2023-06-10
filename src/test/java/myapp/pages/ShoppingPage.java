package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage {
    public ShoppingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "add-to-cart")
    public WebElement addToCartButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement addToCartButtonSuccessMessage;

    @FindBy(className = "cart-toggle")
    public WebElement cart;

    @FindBy(xpath = "//a[@href='https://pearlymarket.com/cart/' and text()='View cart']")
    public WebElement viewCart;

    @FindBy(id = "coupon_code")
    public WebElement couponCode;

    @FindBy(name = "apply_coupon")
    public WebElement applyCoupon;

    @FindBy(id = "calc_shipping_country")
    public WebElement shippingCountryDropDown;

    @FindBy(id = "calc_shipping_state")
    public WebElement shippingStateDropDown;

    @FindBy(id = "calc_shipping_city")
    public WebElement shippingCity;

    @FindBy(id = "calc_shipping_postcode")
    public WebElement shippingPostcode;

    @FindBy(name = "calc_shipping")
    public WebElement updateTotals;

    @FindBy(linkText = "Checkout")
    public WebElement checkout;
    @FindBy(xpath = "(//a[@href='https://pearlymarket.com/checkout-2/'])[3]")
    public WebElement proceedToCheckout;


    @FindBy(xpath = "//*[.='Thank you. Your order has been received.']")
    public WebElement orderReceivedMessage;


}
