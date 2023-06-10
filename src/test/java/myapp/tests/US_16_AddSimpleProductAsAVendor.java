package myapp.tests;

import myapp.pages.AddProduct;
import myapp.pages.HomePage;
import myapp.pages.LoginPage;
import myapp.pages.StoreManagerPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_16_AddSimpleProductAsAVendor {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    StoreManagerPage storeManagerPage = new StoreManagerPage();

    AddProduct addProduct = new AddProduct();
    @Test
    public void deneme() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));
        homePage.signIn.click();
        loginPage.username.sendKeys("nightblood.nb2");
        loginPage.password.sendKeys("nbTest@23");
        loginPage.loginButton.click();
        Thread.sleep(5000);

        Driver.getDriver().get("https://pearlymarket.com/store-manager/");

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManagerPage.products).perform();
        storeManagerPage.addnew.click();

        Select dropdown = new Select(addProduct.proType);
        String simple = dropdown.getFirstSelectedOption().getText();
        Assert.assertTrue(simple.equals("Simple Product"));

        addProduct.proTitle.sendKeys("Sample1");
        addProduct.regPrice.sendKeys("10");
        addProduct.salePrice.sendKeys("15");


        addProduct.featImg.click();
        Driver.getDriver().findElement(By.id("menu-item-browse")).click();
        Driver.getDriver().findElement(By.xpath("//li[@aria-label='Daisy']")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//button[text()='Select']")).click();

        Thread.sleep(1000);
        addProduct.galImg.click();
        //Driver.getDriver().findElement(By.id("menu-item-browse")).click();
        Driver.getDriver().findElement(By.xpath("(//li[@aria-label='Cosmos'])[2]")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//*[@id='__wp-uploader-id-3']/div[4]/div/div[2]/button")).click();


        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);", addProduct.checklist);
        Thread.sleep(2000);

        addProduct.gift.click();

        JavascriptExecutor executor1 = (JavascriptExecutor) Driver.getDriver();
        executor1.executeScript("arguments[0].scrollIntoView(true);", addProduct.submitbttn);

        JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
        executor2.executeScript("arguments[0].click();",addProduct.submitbttn);

        Thread.sleep(3000);

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[text()='Published']")).getText().equals("Published"));

    }
}