package myapp.tests;

import myapp.pages.BillingDetailsPage;
import myapp.pages.HomePage;
import myapp.pages.LoginPage;
import myapp.pages.ShoppingPage;
import myapp.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_19_UserShouldToUseCreatedCoupon {
    @Test
    public void userShouldBeAbleToShopOnTheSite() {
        // 1. Go to https://pearlymarket.com/
        TestBase.goToURL();
        // 2. Click on Sign In and enter username and password
        TestBase.userSignIn();

        //The user should be able to find the desired product in the search box.
        HomePage homePage = new HomePage();
        WaitUtils.waitFor(5);
        homePage.searchInput.sendKeys("Ergonomic Wireless Mouse" + Keys.ENTER);
        WaitUtils.waitFor(2);

        //The user should be able to add the product they are looking for to their cart. (ADD TO CART)
        ShoppingPage shoppingPage = new ShoppingPage();
        JSUtils.clickWithTimeoutByJS(shoppingPage.addToCartButton);
        //User should see the items that have been added to the cart.
        JSUtils.clickWithTimeoutByJS(shoppingPage.cart);
        ReusableMethods.verifyElementDisplayed(shoppingPage.addToCartButtonSuccessMessage);
        //The amount of products in the cart should be adjustable by the user.
        JSUtils.clickWithTimeoutByJS(shoppingPage.viewCart);
        ShoppingPage shoppingPage1 = new ShoppingPage();
        JSUtils.clickWithTimeoutByJS(shoppingPage1.plusButton);
        JSUtils.clickWithTimeoutByJS(shoppingPage1.plusButton);
        JSUtils.clickWithTimeoutByJS(shoppingPage1.minusButton);
        JSUtils.clickWithTimeoutByJS(shoppingPage1.updateCart);
        JSUtils.clickWithTimeoutByJS(shoppingPage1.proceedToCheckout);
        //User should be able to see the Billing Address in order to purchase the products
        BillingDetailsPage billingDetailsPage = new BillingDetailsPage();
        JSUtils.clickWithTimeoutByJS(billingDetailsPage.enterYourCode);
        billingDetailsPage.couponCode.sendKeys("BNM123");
        JSUtils.clickWithTimeoutByJS(billingDetailsPage.applyCoupon);
        billingDetailsPage.billingFirstName.sendKeys("Yavuz");
        billingDetailsPage.billingLastName.sendKeys("Akcakoyun");
        ReusableMethods.selectByValue(billingDetailsPage.billingCountryDropDown, "GB");
        billingDetailsPage.billingCity.sendKeys("Liverpool");
        billingDetailsPage.billingAddress1.sendKeys();


        //The user should be able to view and select payment options.

        //The user should be able to complete their purchase.

    }
}
