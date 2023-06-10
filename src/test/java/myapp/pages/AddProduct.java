package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProduct {
    public AddProduct(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="product_type")
    public WebElement proType;

    @FindBy (id="pro_title")
    public WebElement proTitle;

    @FindBy (id="regular_price")
    public WebElement regPrice;

    @FindBy (id="sale_price")
    public WebElement salePrice;

    //@FindBy(xpath = "//body[@data-id='excerpt']")
    //public WebElement shrtDes;

    //@FindBy(id = "description_ifr")
    //public WebElement lngtDes;

    @FindBy(id = "featured_img_display")
    public WebElement featImg;

    @FindBy(id = "gallery_img_gimage_0_display")
    public WebElement galImg;

    @FindBy(xpath = "//*[@id='product_cats_checklist']")
    public WebElement checklist;

    @FindBy(xpath = "//input[@value='486']")
    public WebElement gift;

    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitbttn;
}
