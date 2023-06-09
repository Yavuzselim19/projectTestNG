package myapp.tests;

import myapp.pages.HomePage;
import myapp.pages.LoginPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;

public class SignIn {
    // @Test => commented for using below method in another classes.
    public static void signIn(){
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        homePage.signIn.click();

        loginPage.username.sendKeys(ConfigReader.getProperty("vendor_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.rememberMe.click();
        loginPage.loginButton.click();

        //WaitUtils.waitFor(10);

        //Driver.closeDriver();
    }
}
