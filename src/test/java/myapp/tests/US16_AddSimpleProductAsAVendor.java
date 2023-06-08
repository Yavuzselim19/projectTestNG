package myapp.tests;

import myapp.pages.AddProductYsf;
import myapp.pages.PearlyHomePage;
import myapp.pages.PearlyLoginPage;
import myapp.pages.StoreManagerYsf;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US16_AddSimpleProductAsAVendor {
    PearlyHomePage pearlyHomePage = new PearlyHomePage();
    PearlyLoginPage pearlyLoginPage = new PearlyLoginPage();
    StoreManagerYsf storeManagerYsf = new StoreManagerYsf();

    AddProductYsf addProductYsf = new AddProductYsf();
    @Test
    public void deneme() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));
        pearlyHomePage.signIn.click();
        pearlyLoginPage.username.sendKeys("nightblood.nb2");
        pearlyLoginPage.password.sendKeys("nbTest@23");
        pearlyLoginPage.loginButton.click();
        Thread.sleep(5000);

        Driver.getDriver().get("https://pearlymarket.com/store-manager/");

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManagerYsf.product).perform();
        storeManagerYsf.addnew.click();

        Select dropdown = new Select(addProductYsf.proType);
        String simple = dropdown.getFirstSelectedOption().getText();
        Assert.assertTrue(simple.equals("Simple Product"));

        addProductYsf.proTitle.sendKeys("Sample1");
        addProductYsf.regPrice.sendKeys("10");
        addProductYsf.salePrice.sendKeys("15");


        addProductYsf.featImg.click();
        Driver.getDriver().findElement(By.id("menu-item-browse")).click();
        Driver.getDriver().findElement(By.xpath("//li[@aria-label='Daisy']")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//button[text()='Select']")).click();

        Thread.sleep(1000);
        addProductYsf.galImg.click();
        //Driver.getDriver().findElement(By.id("menu-item-browse")).click();
        Driver.getDriver().findElement(By.xpath("(//li[@aria-label='Cosmos'])[2]")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//*[@id='__wp-uploader-id-3']/div[4]/div/div[2]/button")).click();


        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);", addProductYsf.checklist);
        Thread.sleep(2000);

        addProductYsf.gift.click();

        JavascriptExecutor executor1 = (JavascriptExecutor) Driver.getDriver();
        executor1.executeScript("arguments[0].scrollIntoView(true);", addProductYsf.submitbttn);

        JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
        executor2.executeScript("arguments[0].click();",addProductYsf.submitbttn);

        Thread.sleep(3000);

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[text()='Published']")).getText().equals("Published"));







    }
}
