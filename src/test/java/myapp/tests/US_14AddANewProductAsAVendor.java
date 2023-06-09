package myapp.tests;

import com.github.javafaker.Faker;
import myapp.pages.VendorHomePage;
import myapp.pages.VendorMyAccountPage;
import myapp.pages.VendorProductsManagePage;
import myapp.pages.VendorStoreManagerPage;
import myapp.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static myapp.utilities.Driver.driver;

public class US_14AddANewProductAsAVendor {




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
    public void AddANewProductAsAVendor() throws InterruptedException {

// 1_Go to My Account > Store Manager > Product > Add New.

        VendorHomePage vendorHomePage = new VendorHomePage();
        VendorMyAccountPage vendorMyAccountPage = new VendorMyAccountPage();
        VendorStoreManagerPage vendorStoreManagerPage = new VendorStoreManagerPage();
        VendorProductsManagePage vendorProductsManagePage = new VendorProductsManagePage();

        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));
        vendorHomePage.signIn.click();
        vendorHomePage.username.sendKeys("nightblood.nb2");
        vendorHomePage.password.sendKeys("nbTest@23");
        vendorHomePage.submitButton.click();
        WaitUtils.waitFor(2);
        ReusableMethods.pageEnd();
        WaitUtils.waitForClickablility(vendorMyAccountPage.myAccount,5).click();
        vendorStoreManagerPage.storeManagerPage.click();
        WaitUtils.waitFor(5);
        WaitUtils.waitForVisibility(vendorStoreManagerPage.products, 5).click();
        WaitUtils.waitForVisibility(vendorStoreManagerPage.addNew, 5).click();


//Verify the user is on Add New page


        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("products-manage"));

//Select the type of product

        WebElement dropdown = vendorProductsManagePage.product_type;
        Select options1 = new Select(dropdown);
        options1.selectByIndex(1);

//Add a product photo.


        WaitUtils.waitForVisibility(vendorProductsManagePage.featuredImg, 10).click();
        WaitUtils.waitForVisibility(vendorProductsManagePage.menu_item_browse, 10).click();
        WaitUtils.waitForVisibility(vendorProductsManagePage.image1, 10).click();
        vendorProductsManagePage.select.click();
        ReusableMethods.scrollDownActions();
        WaitUtils.waitForVisibility(vendorProductsManagePage.galleryImg, 50).click();
        WaitUtils.waitForVisibility(vendorProductsManagePage.image2, 50).click();
        WaitUtils.waitForClickablility(vendorProductsManagePage.addToGallery, 50).click();

//Assert that images are displayed

        Assert.assertTrue(vendorProductsManagePage.img1Src.isDisplayed());
        Assert.assertTrue(vendorProductsManagePage.img2Src.isDisplayed());

//Enter a product title.

        WaitUtils.waitForVisibility(vendorProductsManagePage.pro_title,20).sendKeys("Wall Decorations");

//Assert that product title is entered

        Assert.assertEquals(JSUtils.getValueByJS("pro_title"),"Wall Decorations");

//Enter a short description.

        driver.switchTo().frame(vendorProductsManagePage.iframe1);
        vendorProductsManagePage.shortDescription.sendKeys("Buy Art | Original Artwork, Wall Art & Art Prints");
        driver.switchTo().defaultContent();
        Assert.assertTrue(vendorProductsManagePage.shortDescription.isDisplayed());

//Enter a description.
        driver.switchTo().defaultContent();
        driver.switchTo().frame(vendorProductsManagePage.iframe2);
        vendorProductsManagePage.description.sendKeys("Check out our original art selection for the very best in unique or custom, handmade pieces from our wall hangings shops.");
        driver.switchTo().defaultContent();

//Select categories.

      WaitUtils.waitForClickablility(vendorProductsManagePage.accessories, 50).click();
      WaitUtils.waitForClickablility(vendorProductsManagePage.audi, 50).click();

//Add new categories.
        Faker faker = new Faker();
        WaitUtils.waitForClickablility(vendorProductsManagePage.addNewCategory, 50).click();
        WaitUtils.waitForVisibility(vendorProductsManagePage.categoryName, 50).sendKeys(faker.company().industry());
        JSUtils.clickWithTimeoutByJS(vendorProductsManagePage.add);

//Select brands.

        JSUtils.clickWithTimeoutByJS(vendorProductsManagePage.adidas);
        JSUtils.clickWithTimeoutByJS(vendorProductsManagePage.audiBrand);


//Add new brands.

        JSUtils.clickWithTimeoutByJS(vendorProductsManagePage.addNewBrands);
        WaitUtils.waitForVisibility(vendorProductsManagePage.brandName, 50).sendKeys(faker.company().industry());
        ReusableMethods.scrollDownActions();
        JSUtils.clickWithTimeoutByJS(vendorProductsManagePage.addBrand);

    }



}
