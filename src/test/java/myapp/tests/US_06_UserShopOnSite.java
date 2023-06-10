package myapp.tests;


import myapp.pages.HomePage;
import myapp.pages.LoginPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_06_UserShopOnSite {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();




    @Test
    public void Test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));
        homePage.signIn.click();
        loginPage.username.sendKeys("nightblood");
        loginPage.password.sendKeys("nbTest@23");
        loginPage.loginButton.click();
        Thread.sleep(3000);
        homePage.searchInput.sendKeys("chair", Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("//button[@name='add-to-cart']")).click();
        Driver.getDriver().findElement(By.xpath("//span[@class='cart-name']")).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//a[text()='View cart']")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//button[@title='Plus']")).click();

        String adress = Driver.getDriver().findElement(By.xpath("//p[@class='woocommerce-shipping-destination']")).getText();

        Assert.assertEquals(adress,"Shipping to fdf, sdf, NY 44138, United States (US).");
        Driver.getDriver().findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();

        WebElement wire_transfer_eft = Driver.getDriver().findElement(By.xpath("//label[@for='payment_method_bacs']"));
        WebElement pay_at_the_door = Driver.getDriver().findElement(By.xpath("//label[@for='payment_method_cod']"));
        Assert.assertTrue(wire_transfer_eft.isDisplayed());
        Assert.assertTrue(pay_at_the_door.isDisplayed());
        wire_transfer_eft.click();
        pay_at_the_door.click();

        WebElement payment_methods= Driver.getDriver().findElement(By.id("payment"));
        JavascriptExecutor executor =(JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);", payment_methods);

        Driver.getDriver().findElement(By.id("place_order")).click();
        Thread.sleep(5000);

        WebElement thank_you = Driver.getDriver().findElement(By.xpath("//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']"));

        Assert.assertTrue(thank_you.isDisplayed());













        Thread.sleep(5000);
        Driver.closeDriver();




    }






}
