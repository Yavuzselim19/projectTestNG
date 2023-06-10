package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_08_User_Add_Items_To_WishListPage {

    public US_08_User_Add_Items_To_WishListPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "reg_username")
    public WebElement usernameTestBox;

    @FindBy(id = "reg_email")
    public WebElement emailTextBox;

    @FindBy(id = "reg_password")
    public WebElement passwordTextBox;

    @FindBy(id = "register-policy")
    public WebElement registerPolicyButton;

    @FindBy(name = "register")
    public WebElement registerButton;



    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement searchBox;

    @FindBy(xpath = "//a[text()='Apple iPhone 13']")
    public WebElement iphone13;

    @FindBy(xpath = "(//a[@rel='nofollow'])[2]")
    public WebElement addToWishListButton;

    @FindBy(xpath = "(//img[@alt='Pearly Market'])[1]")
    public WebElement mainImage;

    @FindBy(xpath = "(//input[@placeholder='Search'])[1]")
    public WebElement searchBox2;

    @FindBy(xpath = "(//a[@rel='nofollow'])[2]")
    public WebElement addToWishListButton2;

    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement searchBox3;

    @FindBy(xpath = "//i[@class='w-icon-heart']")
    public WebElement goToWishListButton;
}
