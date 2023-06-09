package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorStoreManagerPage {

    public VendorStoreManagerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Store Manager']")
    public WebElement storeManagerPage;

    @FindBy(xpath = "//a[@href='https://pearlymarket.com/store-manager/products/']")
    public WebElement products;

    @FindBy(xpath = "//a[.='Add New']")
    public WebElement addNew;





}
