package myapp.tests;

import myapp.pages.US12PearlyAddressPage;
import myapp.pages.US12PearlyHomePage;
import myapp.pages.US12PearlyLoginPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_12_VendorBillingAddressTest {

    @Test
    public  void US12VendorBillingAddressTest() throws InterruptedException {

        US12PearlyHomePage US12PearlyHomePage = new US12PearlyHomePage();
        US12PearlyLoginPage US12PearlyLoginPage = new US12PearlyLoginPage();
        US12PearlyAddressPage US12PearlyAddressPage = new US12PearlyAddressPage();

        //1. Go to the "https://pearlymarket.com/
        Driver.getDriver().get(ConfigReader.getProperty("US12_pearlymarket_url"));
        // 2.click sing In
        US12PearlyHomePage.signIn.click();
        //3. enter Vendor username and password
        US12PearlyLoginPage.username.sendKeys(ConfigReader.getProperty("US12_vendor_username"));
        US12PearlyLoginPage.password.sendKeys(ConfigReader.getProperty("US12_vendor_password"));
        // 4.click remember Me button
        US12PearlyLoginPage.rememberMe.click();
        //5.click login Button
        US12PearlyLoginPage.loginButton.click();
        //verify sing out button is displayed
        ReusableMethods.verifyElementDisplayed(US12PearlyHomePage.singOut);
        // 6.click on sing out button
        US12PearlyHomePage.singOut.click();
        // 7.Verify the title includes My Account
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("My Account"));
        //8 scroll down the page
        new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_DOWN).perform();
        //click on Addresses
        Thread.sleep(2000);
        US12PearlyHomePage.Addresses.click();
        new Actions(Driver.getDriver()).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        // click edit Address
        US12PearlyHomePage.editAddress.click();
        //enter vendor first name
        US12PearlyAddressPage.vendorFirstName.clear();
        US12PearlyAddressPage.vendorFirstName.sendKeys(ConfigReader.getProperty("US12_vendor_first_name"));
        //enter vendor last name
        US12PearlyAddressPage.vendorLastName.clear();
        US12PearlyAddressPage.vendorLastName.sendKeys(ConfigReader.getProperty("US12_vendor_last_name"));
        //enter vendor company name
        US12PearlyAddressPage.vendorCompany.clear();
        US12PearlyAddressPage.vendorCompany.sendKeys(ConfigReader.getProperty("US12_vendor_company"));
        // enter vendor country
        ReusableMethods.selectByValue(US12PearlyAddressPage.vendorCountryDropDown, "GB");
        // enter vendor street
        US12PearlyAddressPage.vendorStreet.clear();
        US12PearlyAddressPage.vendorStreet.sendKeys(ConfigReader.getProperty("US12_vendor_street"));
        //enter apartment number
        US12PearlyAddressPage.vendorApartmentNumber.clear();
        US12PearlyAddressPage.vendorApartmentNumber.sendKeys(ConfigReader.getProperty("US12_vendor_apartment_number"));
        // enter vendor city
        US12PearlyAddressPage.vendorCity.clear();
        US12PearlyAddressPage.vendorCity.sendKeys(ConfigReader.getProperty("US12_vendor_city"));
        //enter vendor post code
        US12PearlyAddressPage.vendorPostCode.clear();
        US12PearlyAddressPage.vendorPostCode.sendKeys(ConfigReader.getProperty("US12_vendor_postCode"));
        //enter vendor phone number
        US12PearlyAddressPage.vendorPhone.clear();
        US12PearlyAddressPage.vendorPhone.sendKeys(ConfigReader.getProperty("US12_vendor_phone"));
        //verify email address is automatically display
        ReusableMethods.verifyElementDisplayed(US12PearlyAddressPage.vendorEmail);
        US12PearlyHomePage.saveAddressButton.sendKeys(Keys.ENTER);
        ReusableMethods.verifyElementDisplayed(US12PearlyHomePage.addressAdded);
        Driver.closeDriver();
    }
}
