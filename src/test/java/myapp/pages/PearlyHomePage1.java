package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PearlyHomePage1 {
    public PearlyHomePage1() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath =" //*[@class='register inline-type']")
    public WebElement register;

    @FindBy(xpath="(//a[@href='https://pearlymarket.com/vendor-register/'])[2]")
    public WebElement becomevendor;

    @FindBy(xpath ="( //*[@type='password'])[1]")
    public WebElement vendorPassword;
    @FindBy(xpath = "//*[text()='Too short']")
    public WebElement tooShort;
    @FindBy(xpath = "//*[@class='weak']")
    public WebElement weak;
    @FindBy(xpath = "//*[@class='good']")
    public WebElement good;
    @FindBy(xpath =" //*[@class='strong']")
    public WebElement strong;
}

