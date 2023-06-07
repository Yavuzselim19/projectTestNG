package myapp.tests;

import myapp.pages.HomePage;
import myapp.pages.LoginPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;

public class SignIn {
    // @Test => commented for using below method in another classes.
    public static void signIn(){
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));
        HomePage pearlyHomePage = new HomePage();
        LoginPage pearlyLoginPage = new LoginPage();

        pearlyHomePage.signIn.click();

        pearlyLoginPage.username.sendKeys(ConfigReader.getProperty("vendor_username"));
        pearlyLoginPage.password.sendKeys(ConfigReader.getProperty("password"));
        pearlyLoginPage.rememberMe.click();
        pearlyLoginPage.loginButton.click();

        //WaitUtils.waitFor(10);

        //Driver.closeDriver();
    }
}
