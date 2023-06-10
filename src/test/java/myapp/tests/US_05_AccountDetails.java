package myapp.tests;

import myapp.pages.PearlyPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.JSUtils;
import myapp.utilities.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_05_AccountDetails {
    @Test
    public void AccountDetailsTest(){
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));
        PearlyPage pearlyPage=new PearlyPage();

        //  WaitUtils.waitFor(10);

        pearlyPage.SignIn.click();
        pearlyPage.username1.sendKeys(ConfigReader.getProperty("username1"));
        pearlyPage.password1.sendKeys(ConfigReader.getProperty("password1"));
        pearlyPage.rememberme.click();
        pearlyPage.submit.submit();

        JSUtils.scrollAllTheWayDownJS();
        WaitUtils.waitFor(3);
        pearlyPage.MyAccount.click();
        WaitUtils.waitFor(3);
        JSUtils.scrollAllTheWayDownJS();
        WaitUtils.waitFor(3);
        pearlyPage.accountdetails.click();
        WaitUtils.waitFor(3);


        pearlyPage.accountFirstname.sendKeys(ConfigReader.getProperty("accountFirstname"));
        pearlyPage.accountLastname.sendKeys(ConfigReader.getProperty("accountLastname"));

        Assert.assertTrue(pearlyPage.displayname.isDisplayed());
        Assert.assertTrue(pearlyPage.accountmail.isDisplayed());
        WebElement iframe =Driver.getDriver().findElement(By.id("user_description_ifr"));
        Driver.getDriver().switchTo().frame(iframe);


        pearlyPage.biography.sendKeys(ConfigReader.getProperty("biography"));
        Driver.getDriver().switchTo().defaultContent();
        pearlyPage.currentPassword.sendKeys(ConfigReader.getProperty("password1"));
        pearlyPage.newPassword.sendKeys(ConfigReader.getProperty("newPassword"));
        pearlyPage.confirmPassword.sendKeys(ConfigReader.getProperty("confirmPassword"));
        JSUtils.scrollAllTheWayDownJS();
        WaitUtils.waitFor(3);
        pearlyPage.saveChanges.click();

        Driver.closeDriver();
    }
}

