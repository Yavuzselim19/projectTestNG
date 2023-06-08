package myapp.tests;

import myapp.pages.PearlyVendorHomePage;
import myapp.pages.PearlyVendorLoginPage;
import myapp.utilities.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US_11_VendorLoginPageTest {
    @Test
    public void vendorSignInTest() {

        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));
        //WaitUtils.waitFor(2);

        PearlyVendorLoginPage pearlyVendorLoginPage = new PearlyVendorLoginPage();
        PearlyVendorHomePage pearlyVendorHomePage = new PearlyVendorHomePage();
        pearlyVendorLoginPage.signInButtonLink.click();
        WaitUtils.waitFor(2);

        pearlyVendorLoginPage.vendorUserName.sendKeys(ConfigReader.getProperty("vendor_UserName2"));

        pearlyVendorLoginPage.vendorPassword.sendKeys(ConfigReader.getProperty("vendor_Password2"));
        WaitUtils.waitFor(3);
        pearlyVendorLoginPage.signInButton.click();
        WaitUtils.waitFor(2);

        JSUtils.scrollAllTheWayDownJS();
        WaitUtils.waitFor(3);
        pearlyVendorHomePage.myAccountText.click();
        WaitUtils.waitFor(3);
        Assert.assertTrue(pearlyVendorHomePage.myAccountUpp.isDisplayed());


        /*

        List<String> valuesList = Arrays.asList("Dashboard", "Store Manager", "Orders", "Downloads", "Addresses", "Account details", "Wishlist", "Support Tickets", "Followings", "Logout");
                List<WebElement> elements = pearlyVendorHomePage.titles2;
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
            ReusableMethods.verifyElementDisplayed(elements.get(i));
            Assert.assertTrue(elements.get(i).getText().equals(valuesList.get(i)));
        }

         */


        ReusableMethods.verifyElementDisplayed(pearlyVendorHomePage.storeManager);
        ReusableMethods.verifyElementDisplayed(pearlyVendorHomePage.orders);
        ReusableMethods.verifyElementDisplayed(pearlyVendorHomePage.downloads);
        ReusableMethods.verifyElementDisplayed(pearlyVendorHomePage.addresses);
        ReusableMethods.verifyElementDisplayed(pearlyVendorHomePage.accountDetails);
        ReusableMethods.verifyElementDisplayed(pearlyVendorHomePage.wishlist);
        ReusableMethods.verifyElementDisplayed(pearlyVendorHomePage.supportTickets);
        ReusableMethods.verifyElementDisplayed(pearlyVendorHomePage.followings);
        ReusableMethods.verifyElementDisplayed(pearlyVendorHomePage.logout);

    }
}