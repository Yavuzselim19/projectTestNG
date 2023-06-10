package myapp.tests;

import myapp.pages.PearlyHomePage1;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_10_PasswordLevelChart {
    WebDriver driver;

    @Test
    public void PasswordLevelChartTest1() {
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));
        PearlyHomePage1 pearlyHomePage = new PearlyHomePage1();
        pearlyHomePage.register.click();
        pearlyHomePage.becomevendor.click();
        pearlyHomePage.vendorPassword.sendKeys(ConfigReader.getProperty("vendorPassword1"));
        Assert.assertTrue(pearlyHomePage.tooShort.isDisplayed());
        WaitUtils.waitFor(5);

    }

    @Test
    public void PasswordLevelChartTest2() {
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));
        PearlyHomePage1 pearlyHomePage = new PearlyHomePage1();
        pearlyHomePage.register.click();
        pearlyHomePage.becomevendor.click();
        pearlyHomePage.vendorPassword.sendKeys(ConfigReader.getProperty("vendorPassword2"));
        Assert.assertTrue(pearlyHomePage.weak.isDisplayed());
        WaitUtils.waitFor(5);
    }

    @Test
    public void PasswordLevelChartTest3() {
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));
        PearlyHomePage1 pearlyHomePage = new PearlyHomePage1();
        pearlyHomePage.register.click();
        pearlyHomePage.becomevendor.click();
        pearlyHomePage.vendorPassword.sendKeys(ConfigReader.getProperty("vendorPassword3"));
        Assert.assertTrue(pearlyHomePage.good.isDisplayed());
        WaitUtils.waitFor(5);

    }

    @Test
    public void PasswordLevelChartTest4() {
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));
        PearlyHomePage1 pearlyHomePage = new PearlyHomePage1();
        pearlyHomePage.register.click();
        pearlyHomePage.becomevendor.click();
        pearlyHomePage.vendorPassword.sendKeys(ConfigReader.getProperty("vendorPassword4"));
        Assert.assertTrue(pearlyHomePage.strong.isDisplayed());
        WaitUtils.waitFor(5);
        Driver.closeDriver();

    }
}


