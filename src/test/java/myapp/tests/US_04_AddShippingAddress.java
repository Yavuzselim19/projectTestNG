package myapp.tests;

import myapp.pages.HomePage;
import myapp.pages.LoginPage;
import myapp.pages.ShippingAddressPage;
import myapp.pages.ShoppingPage;
import myapp.utilities.JSUtils;
import myapp.utilities.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class US_04_AddShippingAddress {

    @Test
    public void loginTest() {

        ShippingAddressPage shippingAddressPage=new ShippingAddressPage();
        ShoppingPage shoppingPage=new ShoppingPage();
        HomePage pearlyHomePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        //Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));
        SignIn.signIn();
        WaitUtils.waitFor(5);

        // 1. go to my account
        JSUtils.clickWithTimeoutByJS(shippingAddressPage.myAccount);
        //2. Click to addresses
        JSUtils.clickWithTimeoutByJS(shippingAddressPage.addressesButton);
        //3. Edit shipping address (No "add" is not possible, there is a bug here.
        JSUtils.clickWithTimeoutByJS(shippingAddressPage.editYourShippingAddress);
        //4. enter First name
        shippingAddressPage.shippingFirstName.clear();
        shippingAddressPage.shippingFirstName.sendKeys("seren");
        //5. Add Last name,
        shippingAddressPage.shippingLastName.clear();
        shippingAddressPage.shippingLastName.sendKeys("casanova");
        //6.Add Shipping Company
        shippingAddressPage.shippingCompany.clear();
        shippingAddressPage.shippingCompany.sendKeys("Pearly.ltd");

        //7. Select Country/Region,
        shippingAddressPage.selectShippingCountryRegion("United States");
        // 8.Add Street address 1, Add Street address 2
        shippingAddressPage.ShippingAddress1.clear();
        shippingAddressPage.ShippingAddress1.sendKeys("805 Mc Cary");
        shippingAddressPage.ShippingAddress2.clear();
        shippingAddressPage.ShippingAddress2.sendKeys(" St SW");

        //9. Add Town / City,
        shippingAddressPage.ShippingCity.clear();
        shippingAddressPage.ShippingCity.sendKeys("Birmingham");
        //10.Add ZIP Code.
        shippingAddressPage.ShippingPostCode.clear();
        shippingAddressPage.ShippingPostCode.sendKeys("35211");
        //10.Select shipping State
        //shippingAddressPage.ShippingState.clear();
        shippingAddressPage.selectShippingState("United States");
        //9. Click 'Save Address'.
        JSUtils.clickWithTimeoutByJS(shippingAddressPage.saveAddress);
        //10. User should see following message: "Address changed successfully."
        assertTrue(shippingAddressPage.ShippingRegistrationMessage.isDisplayed());
        System.out.println(shippingAddressPage.ShippingRegistrationMessage.getText());



    }}