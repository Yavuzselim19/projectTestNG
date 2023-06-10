package myapp.tests;

import com.github.javafaker.Faker;
import myapp.pages.HomePage;
import myapp.pages.US_08_User_Add_Items_To_WishListPage;
import myapp.pages.US_13_Vendor_Should_Be_Able_To_Add_Shipping_AddressPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US_08_User_Add_Items_To_WishList {
    
    HomePage homePage = new HomePage();
    
    US_08_User_Add_Items_To_WishListPage us_08_user_add_items_to_wishListPage = new US_08_User_Add_Items_To_WishListPage();
    
    @Test
    public void us_08(){

        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));

        homePage.register.click();

        String userName = Faker.instance().name().username();

        us_08_user_add_items_to_wishListPage.usernameTestBox.sendKeys(userName);

        String email = Faker.instance().internet().emailAddress();

        us_08_user_add_items_to_wishListPage.emailTextBox.sendKeys(email);

        String password = Faker.instance().internet().password();

        us_08_user_add_items_to_wishListPage.passwordTextBox.sendKeys(password);

        us_08_user_add_items_to_wishListPage.registerPolicyButton.click();

        us_08_user_add_items_to_wishListPage.registerButton.click();

        WaitUtils.waitFor(3);

        us_08_user_add_items_to_wishListPage.searchBox.sendKeys("iphone 13", Keys.ENTER);

        us_08_user_add_items_to_wishListPage.iphone13.click();

        WaitUtils.waitFor(10);


            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();",us_08_user_add_items_to_wishListPage.addToWishListButton);


        WaitUtils.waitFor(3);

        us_08_user_add_items_to_wishListPage.mainImage.click();

        WaitUtils.waitFor(5);

        us_08_user_add_items_to_wishListPage.searchBox2.sendKeys("dualshock", Keys.ENTER);

        WaitUtils.waitFor(5);

        js.executeScript("arguments[0].click();",us_08_user_add_items_to_wishListPage.addToWishListButton);

        WaitUtils.waitFor(3);

        js.executeScript("arguments[0].click();",us_08_user_add_items_to_wishListPage.searchBox);

        us_08_user_add_items_to_wishListPage.searchBox.sendKeys("macbook", Keys.ENTER);

        js.executeScript("arguments[0].click();",us_08_user_add_items_to_wishListPage.addToWishListButton);

        js.executeScript("arguments[0].click();",us_08_user_add_items_to_wishListPage.searchBox);

        us_08_user_add_items_to_wishListPage.searchBox.sendKeys("Samsung OLED TV", Keys.ENTER);

        js.executeScript("arguments[0].click();",us_08_user_add_items_to_wishListPage.addToWishListButton);

        js.executeScript("arguments[0].click();",us_08_user_add_items_to_wishListPage.goToWishListButton);

        List<WebElement> itemsOnWishList = Driver.getDriver().findElements(By.xpath("//button[@title='Quick View']"));

        Assert.assertEquals(itemsOnWishList.size(),4);


    }
    
}
