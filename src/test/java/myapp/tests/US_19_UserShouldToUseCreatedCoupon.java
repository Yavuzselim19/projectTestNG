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
        TestBase.goToURL();
        TestBase.userSignIn();

        HomePage homePage = new HomePage();
        WaitUtils.waitFor(5);
        homePage.searchInput.sendKeys("Ergonomic Wireless Mouse" + Keys.ENTER);
        WaitUtils.waitFor(2);


        ShoppingPage shoppingPage = new ShoppingPage();
        JSUtils.clickWithTimeoutByJS(shoppingPage.addToCartButton);

        JSUtils.clickWithTimeoutByJS(shoppingPage.cart);
        ReusableMethods.verifyElementDisplayed(shoppingPage.addToCartButtonSuccessMessage);

        JSUtils.clickWithTimeoutByJS(shoppingPage.viewCart);
        ShoppingPage shoppingPage1 = new ShoppingPage();
        JSUtils.clickWithTimeoutByJS(shoppingPage1.plusButton);
        JSUtils.clickWithTimeoutByJS(shoppingPage1.plusButton);
        JSUtils.clickWithTimeoutByJS(shoppingPage1.minusButton);
        JSUtils.clickWithTimeoutByJS(shoppingPage1.updateCart);
        JSUtils.clickWithTimeoutByJS(shoppingPage1.proceedToCheckout);

        BillingDetailsPage billingDetailsPage = new BillingDetailsPage();
        JSUtils.clickWithTimeoutByJS(billingDetailsPage.enterYourCode);
        billingDetailsPage.couponCode.sendKeys("BNM123");
        JSUtils.clickWithTimeoutByJS(billingDetailsPage.applyCoupon);
        billingDetailsPage.billingFirstName.sendKeys("");
        billingDetailsPage.billingLastName.sendKeys("");
        ReusableMethods.selectByValue(billingDetailsPage.billingCountryDropDown, "US");
        WaitUtils.waitFor(1);
        billingDetailsPage.billingAddress1.sendKeys(" ");
        WaitUtils.waitFor(1);
        billingDetailsPage.billingAddress2.sendKeys("");
        WaitUtils.waitFor(1);
        billingDetailsPage.billingCity.sendKeys("");
        WaitUtils.waitFor(1);
        billingDetailsPage.billingPostcode.sendKeys("");
        WaitUtils.waitFor(1);
        billingDetailsPage.billingPhone.sendKeys("");
        WaitUtils.waitFor(1);
        billingDetailsPage.billingEmail.sendKeys("");
        WaitUtils.waitFor(1);
        JSUtils.clickWithTimeoutByJS(billingDetailsPage.wireTransferEFT);
        JSUtils.clickWithTimeoutByJS(billingDetailsPage.payAtTheDoor);
        JSUtils.clickWithTimeoutByJS(billingDetailsPage.placeOrder);
        Driver.closeDriver();

    }
}
