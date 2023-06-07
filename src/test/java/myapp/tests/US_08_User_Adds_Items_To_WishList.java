package myapp.tests;

import com.github.javafaker.Faker;
import myapp.pages.HomePage;
import myapp.pages.HomePage;
import myapp.pages.US_08_User_Adds_Items_To_WishListPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.WaitUtils;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class US_08_User_Adds_Items_To_WishList {



    @Test
    public void wishListTest(){

        HomePage pearlyHomePage = new HomePage();

        US_08_User_Adds_Items_To_WishListPage us_08_user_adds_items_to_wishListPage = new US_08_User_Adds_Items_To_WishListPage();

        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));

        pearlyHomePage.register.click();

        WaitUtils.waitFor(5);

        String userName = Faker.instance().name().username();

        us_08_user_adds_items_to_wishListPage.usernameTestBox.sendKeys(userName);

        String email = Faker.instance().internet().emailAddress();

        us_08_user_adds_items_to_wishListPage.emailTextBox.sendKeys(email);

        String password = Faker.instance().internet().password();

        us_08_user_adds_items_to_wishListPage.passwordTextBox.sendKeys(password);

        us_08_user_adds_items_to_wishListPage.registerPolicyButton.click();

        us_08_user_adds_items_to_wishListPage.registerButton.click();

        us_08_user_adds_items_to_wishListPage.signOutButton.click();

        us_08_user_adds_items_to_wishListPage.addressesButton.click();

        us_08_user_adds_items_to_wishListPage.addButton.click();

        us_08_user_adds_items_to_wishListPage.shippingFirstnameTextBox.sendKeys("John");

        us_08_user_adds_items_to_wishListPage.shippingLastnameTextBox.sendKeys("Doe");

        us_08_user_adds_items_to_wishListPage.shippingCompanyTextBox.sendKeys("Apple");

        us_08_user_adds_items_to_wishListPage.shippingCountryContainer.click();

        us_08_user_adds_items_to_wishListPage.shippingCountryTextBox.sendKeys("United States (US)", Keys.ENTER);

        us_08_user_adds_items_to_wishListPage.shippingAddressLine1.sendKeys("Beverly Hills");

        us_08_user_adds_items_to_wishListPage.shippingAddressLine2.sendKeys("Hollywood");

        us_08_user_adds_items_to_wishListPage.shippingCityTextBox.sendKeys("Los Angeles");

        us_08_user_adds_items_to_wishListPage.stateTextBox.sendKeys("California",Keys.ENTER);

        us_08_user_adds_items_to_wishListPage.shippingPostCodeTextBox.sendKeys(Faker.instance().address().zipCode());

        us_08_user_adds_items_to_wishListPage.SaveAddressButton.sendKeys(Keys.RETURN);


    }

}
