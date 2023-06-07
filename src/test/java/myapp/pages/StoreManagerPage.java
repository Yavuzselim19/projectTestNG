package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreManagerPage {
    public StoreManagerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[.='Home'])[1]")
    public WebElement home;

    @FindBy(xpath = "//a[@href='https://pearlymarket.com/store-manager/media/']")
    public WebElement media;

    @FindBy(xpath = "//a[@href='https://pearlymarket.com/store-manager/articles/']")
    public WebElement articles;

    @FindBy(xpath = "//a[@href='https://pearlymarket.com/store-manager/products/']")
    public WebElement products;

    @FindBy(xpath = "https://pearlymarket.com/store-manager/orderslist/")
    public WebElement orders;

    @FindBy(xpath = "//a[@href='https://pearlymarket.com/store-manager/coupons/']")
    public WebElement coupons;

    @FindBy(xpath = "//a[@href='https://pearlymarket.com/store-manager/customers/']")
    public WebElement customers;




    @FindBy(xpath = "//span[.='Logout']")
    public WebElement logOut;


}
