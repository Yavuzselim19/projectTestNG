package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CouponPage {
    public CouponPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Add New']")
    public WebElement addNew;

    @FindBy(id = "title")
    public WebElement codeInput;

    @FindBy(id = "description")
    public WebElement descriptionTextArea;

    @FindBy(id = "discount_type")
    public WebElement discountType;

    @FindBy(id = "coupon_amount")
    public WebElement couponAmount;

    @FindBy(id = "expiry_date")
    public WebElement couponExpiryDate;

    @FindBy(id = "free_shipping")
    public WebElement allowFreeShipping;

    @FindBy(id = "show_on_store")
    public WebElement showOnStore;

    @FindBy(id = "coupons_manage_restriction")
    public WebElement couponsManageRestriction;

    @FindBy(id = "coupons_manage_limit")
    public WebElement couponManageLimit;

    @FindBy(id = "minimum_amount")
    public WebElement minimumSpend;

    @FindBy(id = "maximum_amount")
    public WebElement maximumSpend;

    @FindBy(id = "individual_use")
    public WebElement individualUseOnly;


    @FindBy(id = "exclude_sale_items")
    public WebElement excludeSaleItems;

    @FindBy(xpath = "(//input[@class='select2-search__field'])[1]")
    public WebElement filterProducts;

    @FindBy(id = "wcfm_coupon_manager_draft_button")
    public WebElement draftButton;

    @FindBy(id = "wcfm_coupon_manager_submit_button")
    public WebElement submitButton;



}
