package myapp.tests;

import com.github.javafaker.Faker;
import myapp.pages.HomePage;
import myapp.pages.US_13_Vendor_Should_Be_Able_To_Add_Shipping_AddressPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class US_13_Vendor_Should_Be_Able_To_Add_Shipping_Address {



    @Test
    public void wishListTest(){

        HomePage pearlyHomePage = new HomePage();

        US_13_Vendor_Should_Be_Able_To_Add_Shipping_AddressPage us_13VendorShouldBeAble_to_addShippingAddressPage = new US_13_Vendor_Should_Be_Able_To_Add_Shipping_AddressPage();

        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));

        pearlyHomePage.register.click();

        String userName = Faker.instance().name().username();

        us_13VendorShouldBeAble_to_addShippingAddressPage.usernameTestBox.sendKeys(userName);

        String email = Faker.instance().internet().emailAddress();

        us_13VendorShouldBeAble_to_addShippingAddressPage.emailTextBox.sendKeys(email);

        String password = Faker.instance().internet().password();

        us_13VendorShouldBeAble_to_addShippingAddressPage.passwordTextBox.sendKeys(password);

        us_13VendorShouldBeAble_to_addShippingAddressPage.registerPolicyButton.click();

        us_13VendorShouldBeAble_to_addShippingAddressPage.registerButton.click();

        us_13VendorShouldBeAble_to_addShippingAddressPage.signOutButton.click();

        us_13VendorShouldBeAble_to_addShippingAddressPage.addressesButton.click();

        us_13VendorShouldBeAble_to_addShippingAddressPage.addButton.click();

        us_13VendorShouldBeAble_to_addShippingAddressPage.shippingFirstnameTextBox.sendKeys("John");

        us_13VendorShouldBeAble_to_addShippingAddressPage.shippingLastnameTextBox.sendKeys("Doe");

        us_13VendorShouldBeAble_to_addShippingAddressPage.shippingCompanyTextBox.sendKeys("Apple");

        us_13VendorShouldBeAble_to_addShippingAddressPage.shippingCountryContainer.click();

        us_13VendorShouldBeAble_to_addShippingAddressPage.shippingCountryTextBox.sendKeys("United States (US)", Keys.ENTER);

        us_13VendorShouldBeAble_to_addShippingAddressPage.shippingAddressLine1.sendKeys("Beverly Hills");

        us_13VendorShouldBeAble_to_addShippingAddressPage.shippingAddressLine2.sendKeys("Hollywood");

        us_13VendorShouldBeAble_to_addShippingAddressPage.shippingCityTextBox.sendKeys("Los Angeles");

        us_13VendorShouldBeAble_to_addShippingAddressPage.stateTextBox.sendKeys("California",Keys.ENTER);

        us_13VendorShouldBeAble_to_addShippingAddressPage.shippingPostCodeTextBox.sendKeys(Faker.instance().address().zipCode());

        us_13VendorShouldBeAble_to_addShippingAddressPage.SaveAddressButton.sendKeys(Keys.RETURN);


    }

}
