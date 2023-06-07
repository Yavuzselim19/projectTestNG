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

    @FindBy(linkText = "Checkout")
    public WebElement checkout;
    @FindBy(partialLinkText = "Proceed to checkout")
    public WebElement proceedToCheckout;




}
