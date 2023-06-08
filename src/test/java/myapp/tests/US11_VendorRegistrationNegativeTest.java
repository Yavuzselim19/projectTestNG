package myapp.tests;

import myapp.pages.PearlyVendorHomePage;
import myapp.pages.PearlyVendorLoginPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.ReusableMethods;
import myapp.utilities.WaitUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US11_VendorRegistrationNegativeTest {

    @Test
    public void vendorLoginNegativeTest(){
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));

        PearlyVendorLoginPage pearlyVendorLoginPage = new PearlyVendorLoginPage();
        PearlyVendorHomePage pearlyVendorHomePage = new PearlyVendorHomePage();
        pearlyVendorLoginPage.signInButtonLink.click();
        WaitUtils.waitFor(2);

        //Valid username wrong password

        pearlyVendorLoginPage.vendorUserName.sendKeys(ConfigReader.getProperty("vendor_UserName2"));
        pearlyVendorLoginPage.vendorPassword.sendKeys(ConfigReader.getProperty("vendor_wrong_password"));
        pearlyVendorLoginPage.signInButton.click();
        WaitUtils.waitFor(3);

        //   Assert.assertTrue(pearlyVendorHomePage.wrongUsernameText.isDisplayed());
       ReusableMethods.verifyElementDisplayed(pearlyVendorHomePage.wrongUsernameText);
    }

    @Test
    public void vendorLoginNegativeTest2(){
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));

        //inValid username valid password
        PearlyVendorLoginPage pearlyVendorLoginPage = new PearlyVendorLoginPage();
        PearlyVendorHomePage pearlyVendorHomePage = new PearlyVendorHomePage();
        pearlyVendorLoginPage.signInButtonLink.click();
        //WaitUtils.waitFor(3);

        pearlyVendorLoginPage.vendorUserName.sendKeys(ConfigReader.getProperty("vendor_wrong_username"));
        pearlyVendorLoginPage.vendorPassword.sendKeys(ConfigReader.getProperty("vendor_Password2"));
        pearlyVendorLoginPage.signInButton.click();
        WaitUtils.waitFor(3);
        Assert.assertTrue(pearlyVendorHomePage.wrongUsernameText.isDisplayed());
    }
}




