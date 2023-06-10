package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PearlyPage {
    public PearlyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "iframe[id='user_description_ifr']")
    public WebElement iframe;

    @FindBy(xpath="//span[text()='Sign In']")
    public WebElement SignIn;

    @FindBy(xpath="//input[@name='username']")
    public WebElement username1;

    @FindBy(xpath="//input[@name='password']")
    public WebElement password1;

    @FindBy(xpath="//input[@name='rememberme']")
    public WebElement rememberme;

    @FindBy(xpath="//*[@class='woocommerce-button button woocommerce-form-login__submit']")
    public WebElement submit;

    @FindBy(xpath ="//a[@href='https://pearlymarket.com/my-account-2/']")
    public WebElement MyAccount;
    @FindBy(xpath = "(//*[@class='text-uppercase text-center mb-0'])[4]")
    public WebElement accountdetails;

    @FindBy(xpath="//*[@name='account_first_name']")
    public WebElement accountFirstname;

    @FindBy(xpath = "//*[@id = 'account_last_name']")
    public WebElement accountLastname;

    @FindBy (xpath = "//*[@value='Alice2']")
    public WebElement displayname;

    @FindBy(xpath = "//*[@value='jerel.kruz@fullangle.org']")
    public WebElement accountmail;

    @FindBy(css = "body[data-id='user_description']")
    public WebElement biography;

    @FindBy(xpath = "//*[@name='password_current']")
    public WebElement currentPassword;

    @FindBy(xpath =" //*[@name='password_1']")
    public WebElement newPassword;

    @FindBy(xpath = "//*[@name='password_2']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//*[@value='Save changes']")
    public WebElement saveChanges;


}

