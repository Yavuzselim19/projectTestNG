package myapp.tests;

import myapp.pages.HomePage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import static myapp.utilities.WaitUtils.waitForVisibility;

public class US_09_VendorRegistration {

    HomePage homePage = new HomePage();

    @Test
    public void Test() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));
        String pearly_hndl = Driver.getDriver().getWindowHandle();
        homePage.register.click();

        Driver.getDriver().findElement(By.linkText("Become a Vendor")).click();

        Thread.sleep(3000);

        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://temp-mail.org/en/");

        Thread.sleep(25000);

        String temp_hndl = Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.xpath("//button[@class='btn-rds icon-btn bg-theme click-to-copy copyIconGreenBtn']")).click();
        Driver.getDriver().switchTo().window(pearly_hndl);
        Driver.getDriver().findElement(By.xpath("//input[@name='user_email']")).sendKeys(Keys.COMMAND,"v");

        Thread.sleep(10000);

        Driver.getDriver().findElement(By.id("passoword")).click();

        Thread.sleep(2000);

        Driver.getDriver().switchTo().window(temp_hndl);

        Thread.sleep(35000);

        WebElement code = Driver.getDriver().findElement(By.xpath("(//a[@class='viewLink title-subject'])[2]"));
        String kod = code.getText();
        String last6 = kod.substring(42);
        Driver.getDriver().switchTo().window(pearly_hndl);
        Driver.getDriver().findElement(By.xpath("//input[@name='wcfm_email_verified_input']")).sendKeys(last6);

        Driver.getDriver().findElement(By.id("passoword")).sendKeys("Zeynep123");

        Thread.sleep(2000);

        Driver.getDriver().findElement(By.id("confirm_pwd")).sendKeys("Zeynep123");

        Thread.sleep(2000);

        Driver.getDriver().findElement(By.xpath("//input[@name='save-data']")).click();

        Thread.sleep(15000);

        Driver.closeDriver();

    }

}