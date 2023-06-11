package myapp.tests;

import myapp.pages.HomePage;
import myapp.pages.ShoppingPage;
import myapp.utilities.Driver;
import myapp.utilities.TestBase;
import myapp.utilities.WaitUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class US_07_CompareItems {

    HomePage homePage = new HomePage();
    ShoppingPage shoppingPage = new ShoppingPage();


    @Test
    public void userShouldBeAbleToShopOnTheSite() {
        // 1. Go to https://pearlymarket.com/
        TestBase.goToURL();
        // 2. Click on Sign In and enter username and password
        TestBase.userSignIn();
        WaitUtils.waitFor(5);


        // 3.User should be able to select up to 4 products to compare
        homePage.searchInput.sendKeys("kitchen table"+ Keys.ENTER);
        WaitUtils.waitFor(1);
        shoppingPage.compare.click();
        WaitUtils.waitFor(1);
        homePage.searchInput.sendKeys("Air Frayer"+Keys.ENTER);
        WaitUtils.waitFor(1);
        shoppingPage.compare.click();
        WaitUtils.waitFor(1);
        homePage.searchInput.sendKeys("pencils"+Keys.ENTER);
        WaitUtils.waitFor(1);
        shoppingPage.compare.click();
        WaitUtils.waitFor(1);
        homePage.searchInput.sendKeys("chair"+Keys.ENTER);
        WaitUtils.waitFor(1);
        shoppingPage.compare.click();
        WaitUtils.waitFor(2);

        // 4.The user should be able to remove products from comparison and add new products.
        shoppingPage.startCompare.click();
        WaitUtils.waitFor(1);
        shoppingPage.removeProducts1.click();
        WaitUtils.waitFor(1);
        shoppingPage.removeProducts2.click();
        WaitUtils.waitFor(1);
        homePage.searchInput.sendKeys("kitchen cooker"+ Keys.ENTER);
        WaitUtils.waitFor(1);
        shoppingPage.compare.click();
        WaitUtils.waitFor(1);
        homePage.searchInput.sendKeys("Ergonomic Wireless Mouse"+ Keys.ENTER);
        WaitUtils.waitFor(1);
        shoppingPage.compare.click();
        WaitUtils.waitFor(2);
        shoppingPage.startCompare.click();
        WaitUtils.waitFor(1);

        // 5.The user should be able to compare selected products



        // 6.The user should be able to remove items from the comparison screen.
        shoppingPage.removeProducts1.click();
        WaitUtils.waitFor(1);

        Driver.closeDriver();


    }

}