package myapp.tests;

import myapp.pages.BillingDetailsPage;
import myapp.pages.HomePage;
import myapp.pages.ShoppingPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.JSUtils;
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
        SignIn.signIn();

        // 3. Select "Search" box and send keys
        HomePage pearlyHomePage = new HomePage();
        WaitUtils.waitFor(5);
        pearlyHomePage.searchInput.sendKeys("chair" + Keys.ENTER);

        // 4. Click on "Add to cart" button
        ShoppingPage shoppingPage = new ShoppingPage();
        shoppingPage.addToCartButton.click();

        assertTrue(shoppingPage.addToCartButtonSuccessMessage.getText().contains("has been added to your cart."));

        // 5. Click on the "Cart" to see added products to the cart
        shoppingPage.cart.click();

        // 6. Click to "View Cart" link
        //pearlyShoppingPage.checkout.click();  --> this didn't work, so we clicked with JS Executor
        JSUtils.clickWithTimeoutByJS(shoppingPage.viewCart);

        // 7. Fill shipping details
        shoppingPage.shippingCity.clear();
        shoppingPage.shippingCity.sendKeys("Austin");
        shoppingPage.shippingPostcode.clear();
        shoppingPage.shippingPostcode.sendKeys("78234");
        JSUtils.clickWithTimeoutByJS(shoppingPage.updateTotals);

        // 8. Click on "Proceed to Checkout" button
        JSUtils.clickWithTimeoutByJS(shoppingPage.proceedToCheckout);

        // 9. Send keys to fill Billing Details
        BillingDetailsPage billingDetailsPage = new BillingDetailsPage();
        billingDetailsPage.billingFirstName.clear();
        billingDetailsPage.billingFirstName.sendKeys("Hoja");
        billingDetailsPage.billingLastName.clear();
        billingDetailsPage.billingLastName.sendKeys("Ata");
        billingDetailsPage.billingCompany.clear();
        billingDetailsPage.billingCompany.sendKeys("ABC Company");
        billingDetailsPage.billingAddress1.clear();
        billingDetailsPage.billingAddress1.sendKeys("Street ABC");
        billingDetailsPage.billingAddress2.clear();
        billingDetailsPage.billingAddress2.sendKeys("Apt. 123");
        billingDetailsPage.billingCity.clear();
        billingDetailsPage.billingCity.sendKeys("Austin");
        billingDetailsPage.billingPostcode.clear();
        billingDetailsPage.billingPostcode.sendKeys("73301");
        billingDetailsPage.billingPhone.clear();
        billingDetailsPage.billingPhone.sendKeys("1234556789");
        billingDetailsPage.billingEmail.clear();
        billingDetailsPage.billingEmail.sendKeys("nightblood.nb2@gmail.com");
        billingDetailsPage.orderComments.clear();
        billingDetailsPage.orderComments.sendKeys("Deliver in the afternoon");

        // 10. Click "Pay at the door" option under the Payment Methods
        JSUtils.clickWithTimeoutByJS(billingDetailsPage.payAtTheDoor);

        // 11. Click on the "Place Order" button
        JSUtils.clickWithTimeoutByJS(billingDetailsPage.placeOrder);
        // 12. Verify if the order has been successfully made
        // 13. Click on the "My Orders" link at the bottom of the page
        // 14. To see the details of the ordered product, click on "View" button
        // 15. Confirm it by locating "Order Details" text

        WaitUtils.waitFor(10);
        Driver.closeDriver();
    }






}
