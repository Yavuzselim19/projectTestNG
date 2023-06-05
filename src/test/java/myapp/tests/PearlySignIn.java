package myapp.tests;

import myapp.pages.PearlyHomePage;
import myapp.pages.PearlyLoginPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.WaitUtils;
import org.testng.annotations.Test;

public class PearlySignIn {
    // @Test => commented for using below method in another classes.
    public static void signIn(){
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));
        PearlyHomePage pearlyHomePage = new PearlyHomePage();
        PearlyLoginPage pearlyLoginPage = new PearlyLoginPage();

        pearlyHomePage.signIn.click();

        pearlyLoginPage.username.sendKeys(ConfigReader.getProperty("vendor_username"));
        pearlyLoginPage.password.sendKeys(ConfigReader.getProperty("password"));
        pearlyLoginPage.rememberMe.click();
        pearlyLoginPage.loginButton.click();

        //WaitUtils.waitFor(10);

        //Driver.closeDriver();
    }
}
