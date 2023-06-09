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
    public void AddANewProductAsAVendor() throws InterruptedException {

// 1_Go to My Account > Store Manager > Product > Add New.

        VendorHomePage VendorHomePage = new VendorHomePage();
        VendorMyAccountPage VendorMyAccountPage = new VendorMyAccountPage();
        VendorStoreManagerPage VendorStoreManagerPage = new VendorStoreManagerPage();
        VendorProductsManagePage VendorProductsManagePage = new VendorProductsManagePage();

        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));
        VendorHomePage.signIn.click();
        VendorHomePage.username.sendKeys("nightblood.nb2");
        VendorHomePage.password.sendKeys("nbTest@23");
        VendorHomePage.submitButton.click();
        WaitUtils.waitFor(2);
        ReusableMethods.pageEnd();
        WaitUtils.waitForClickablility(VendorMyAccountPage.myAccount,5).click();
        VendorStoreManagerPage.storeManagerPage.click();
        WaitUtils.waitFor(5);
        WaitUtils.waitForVisibility(VendorStoreManagerPage.products, 5).click();
        WaitUtils.waitForVisibility(VendorStoreManagerPage.addNew, 5).click();


//Verify the user is on Add New page

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("products-manage"));

//Select the type of product

        WebElement dropdown = VendorProductsManagePage.product_type;
        Select options1 = new Select(dropdown);
        options1.selectByIndex(1);

//Add a product photo.

        WaitUtils.waitForVisibility(VendorProductsManagePage.featuredImg, 10).click();
        WaitUtils.waitForVisibility(VendorProductsManagePage.menu_item_browse, 10).click();
        WaitUtils.waitForVisibility(VendorProductsManagePage.image1, 10).click();
        VendorProductsManagePage.select.click();
        ReusableMethods.scrollDownActions();
        WaitUtils.waitForVisibility(VendorProductsManagePage.galleryImg, 50).click();
        WaitUtils.waitForVisibility(VendorProductsManagePage.image2, 50).click();
        WaitUtils.waitForClickablility(VendorProductsManagePage.addToGallery, 50).click();

//Assert that images are displayed

        Assert.assertTrue(VendorProductsManagePage.img1Src.isDisplayed());
        Assert.assertTrue(VendorProductsManagePage.img2Src.isDisplayed());

//Enter a product title.

        WaitUtils.waitForVisibility(VendorProductsManagePage.pro_title,20).sendKeys("Wall Decorations");

//Assert that product title is entered

        Assert.assertEquals(JSUtils.getValueByJS("pro_title"),"Wall Decorations");

//Enter a short description.

        driver.switchTo().frame(VendorProductsManagePage.iframe1);
        VendorProductsManagePage.shortDescription.sendKeys("Buy Art | Original Artwork, Wall Art & Art Prints");
        driver.switchTo().defaultContent();

//Enter a description.
        driver.switchTo().defaultContent();
        driver.switchTo().frame(VendorProductsManagePage.iframe2);
        VendorProductsManagePage.description.sendKeys("Check out our original art selection for the very best in unique or custom, handmade pieces from our wall hangings shops.");
        driver.switchTo().defaultContent();

//Select categories.

      WaitUtils.waitForClickablility(VendorProductsManagePage.accessories, 50).click();
      WaitUtils.waitForClickablility(VendorProductsManagePage.audi, 50).click();

//Add new categories.
        Faker faker = new Faker();
        WaitUtils.waitForClickablility(VendorProductsManagePage.addNewCategory, 50).click();
        WaitUtils.waitForVisibility(VendorProductsManagePage.categoryName, 50).sendKeys(faker.company().industry());
        JSUtils.clickWithTimeoutByJS(VendorProductsManagePage.add);

//Select brands.

        JSUtils.clickWithTimeoutByJS(VendorProductsManagePage.adidas);
        JSUtils.clickWithTimeoutByJS(VendorProductsManagePage.audiBrand);


//Add new brands.

        JSUtils.clickWithTimeoutByJS(VendorProductsManagePage.addNewBrands);
        WaitUtils.waitForVisibility(VendorProductsManagePage.brandName, 50).sendKeys(faker.company().industry());
        ReusableMethods.scrollDownActions();
        JSUtils.clickWithTimeoutByJS(VendorProductsManagePage.addBrand);

    }


}
