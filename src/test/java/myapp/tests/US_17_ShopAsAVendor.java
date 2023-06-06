package myapp.tests;

import myapp.pages.PearlyHomePage;
import myapp.pages.PearlyShoppingPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.WaitUtils;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class US_17_ShopAsAVendor {

    @Test
    public void shopAsAVendorTest(){

        // 1. Go to https://pearlymarket.com/
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));

        // 2. Click on Sign In and enter username and password
        PearlySignIn.signIn();

        // 3. Select "Search" box and send keys
        PearlyHomePage pearlyHomePage = new PearlyHomePage();
        WaitUtils.waitFor(5);
        pearlyHomePage.searchInput.sendKeys("chair" + Keys.ENTER);

        // 4. Click on "Add to cart" button
        PearlyShoppingPage pearlyShoppingPage = new PearlyShoppingPage();
        pearlyShoppingPage.addToCartButton.click();

        assertTrue(pearlyShoppingPage.addToCartButtonSuccessMessage.getText().contains("has been added to your cart."));

        // 5. Click on the "Cart" to see added products to the cart
        pearlyShoppingPage.cart.click();

        // 6. Click to "View Cart" link
       //Driver.getDriver().switchTo().frame(pearlyShoppingPage.viewCart);
        //pearlyShoppingPage.viewCart.click();

        pearlyShoppingPage.checkout.click();

        // 7. Click on "Proceed to Checkout" button
        pearlyShoppingPage.proceedToCheckout.click();

        // 8. Send keys to fill Billing Details
        // 9. Click "Pay at the door" option under the Payment Methods
        // 10. Click on the "Place Order" button
        // 11. Verify if the order has been successfully made
        // 12. Click on the "My Orders" link at the bottom of the page
        // 13. To see the details of the ordered product, click on "View" button
        // 14. Confirm it by locating "Order Details" text

        WaitUtils.waitFor(10);
        Driver.closeDriver();
    }
}
