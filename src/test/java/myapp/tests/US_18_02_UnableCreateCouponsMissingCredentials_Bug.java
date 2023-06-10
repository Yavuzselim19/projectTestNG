package myapp.tests;

import myapp.pages.CouponPage;
import myapp.pages.HomePage;
import myapp.pages.LoginPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_18_02_UnableCreateCouponsMissingCredentials_Bug {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    CouponPage couponPage = new CouponPage();

    @Test
    public void Test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));
        homePage.signIn.click();
        loginPage.username.sendKeys("nightblood.nb2");
        loginPage.password.sendKeys("nbTest@23");
        loginPage.loginButton.click();
        Thread.sleep(5000);

        Driver.getDriver().get("https://pearlymarket.com/store-manager/coupons/");
        couponPage.addNew.click();

        couponPage.codeInput.sendKeys("CPN001");
        couponPage.descriptionTextArea.sendKeys("This coupon discounts the product by percentage");

        couponPage.couponExpiryDate.sendKeys("2023-12-31");
        couponPage.allowFreeShipping.click();
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);", couponPage.couponExpiryDate);
        Thread.sleep(2000);
        couponPage.showOnStore.click();
        couponPage.submitButton.click();

        Thread.sleep(3000);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[text()='Percentage discount']")).getText().equals("Amount should be at least 1"));

    }
}
