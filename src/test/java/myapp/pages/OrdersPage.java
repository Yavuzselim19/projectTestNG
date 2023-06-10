package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage {
    public OrdersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//strong)[1]")
    public WebElement actualOrderNumber;

    @FindBy(xpath = "(//a[.='View'])[1]")
    public WebElement viewOrderDetails;

    // xpath //mark[@class='order-number']
    @FindBy(className = "order-number")
    public WebElement orderNumber;


}
