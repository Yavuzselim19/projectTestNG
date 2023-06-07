package myapp.tests;

import myapp.pages.PearlyHomePage;
import myapp.pages.PearlyLoginPage;
import myapp.pages.VendorMyAccountPage;
import myapp.pages.VendorStoreManagerPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.ReusableMethods;
import myapp.utilities.WaitUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_14_AddANewProductAsAVendor {

     /*
    1_Go to My Account > Store Manager > Product > Add New
    2_ Select the type of product
    3_Add a product photo.
    4_Enter a product title.
    5_Enter a short description.
    6_Enter a description.
    7_Select categories.
    8_Add new categories.
    9_Select brands.
    10_Add new brands.
     */

    @Test
    public void signIn(){

// 1_Go to My Account > Store Manager > Product > Add New.

        PearlyLoginPage pearlyLoginPage = new PearlyLoginPage();
        PearlyHomePage pearlyHomePage = new PearlyHomePage();
        VendorMyAccountPage vendorMyAccountPage = new VendorMyAccountPage();
        VendorStoreManagerPage vendorStoreManagerPage = new VendorStoreManagerPage();
        Driver.getDriver().get(ConfigReader.getProperty("pearly_market_url"));
        pearlyHomePage.signIn.click();
        pearlyLoginPage.username.sendKeys("nightblood.nb2");
        pearlyLoginPage.password.sendKeys("nbTest@23");
        pearlyLoginPage.loginButton.click();
        WaitUtils.waitFor(2);
        ReusableMethods.scrollDownActions();
        WaitUtils.waitForClickablility(vendorMyAccountPage.myAccount,5).click();
        vendorStoreManagerPage.storeManagerPage.click();
        WaitUtils.waitFor(5);
        WaitUtils.waitForVisibility(vendorStoreManagerPage.products, 5).click();
        WaitUtils.waitForVisibility(vendorStoreManagerPage.addNew, 5).click();


//Verify the user is on Add New page

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("products-manage"));

//Select the type of product



//Then verify logout is successful

//Add a product photo.
//Enter a product title.
//Enter a short description.
//Enter a description.
//Select categories.
//Add new categories.
//Select brands.
//Add new brands.

    }


}
