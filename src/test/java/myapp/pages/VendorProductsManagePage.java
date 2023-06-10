package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorProductsManagePage {

    public VendorProductsManagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(id="product_type")
    public WebElement product_type;

    @FindBy(id="pro_title")
    public WebElement pro_title;

    @FindBy(id="featured_img_display")
    public WebElement featuredImg;

    @FindBy(id="gallery_img_gimage_0_display")
    public WebElement galleryImg;


    @FindBy(id="menu-item-browse")
    public WebElement menu_item_browse;

    @FindBy(xpath="//li[@data-id='29822']")
    public WebElement image1;

    @FindBy(xpath="(//div[@class='thumbnail'])[10]")
    public WebElement image2;

    @FindBy(xpath="(//div[@class='media-toolbar-primary search-form'])[2]")
    public WebElement select;

    @FindBy(xpath="(//button[(text()='Add to Gallery')])[2]")
    public WebElement addToGallery;

    @FindBy(xpath = "//iframe[@id='excerpt_ifr']")
    public WebElement iframe1;

    @FindBy(id = "tinymce")
    public WebElement shortDescription;

    @FindBy(xpath = "//iframe[@id='description_ifr']")
    public WebElement iframe2;

    @FindBy(id = "tinymce")
    public WebElement description;

    @FindBy(xpath= "//input[@value='229']")
    public WebElement accessories;

    @FindBy(xpath= "//input[@value='733']")
    public WebElement audi;

    @FindBy(xpath = "//p[.='+Add new category']")
    public WebElement addNewCategory;

    @FindBy(id = "wcfm_new_cat")
    public WebElement categoryName;

    @FindBy(xpath="//button[@data-taxonomy='product_cat']")
    public WebElement add;

    @FindBy(xpath="//select[@id='wcfm_new_parent_cat']")
    public WebElement parentCategory;

    @FindBy(xpath= "//input[@value='432']")
    public WebElement adidas;

    @FindBy(xpath= "//input[@value='750']")
    public WebElement audiBrand;

    @FindBy(xpath = "//p[.='+Add new Product brands']")
    public WebElement addNewBrands;

    @FindBy(id = "wcfm_new_product_brand")
    public WebElement brandName;

    @FindBy(xpath = "//button[@data-taxonomy='product_brand']")
    public WebElement addBrand;

    @FindBy(xpath = "//img[@src='http://pearlymarket.com/wp-content/uploads/2023/06/Daisy.jpeg']")
    public WebElement img1Src;

    @FindBy(xpath = "//img[@src='http://pearlymarket.com/wp-content/uploads/2023/06/Cosmos.jpeg']")
    public WebElement img2Src;







}

