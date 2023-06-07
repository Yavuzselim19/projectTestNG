package myapp.utilities;

import myapp.pages.HomePage;
import myapp.pages.LoginPage;

public class TestBase {

    public static void driver(){
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));
    }
    public static void userSignIn(){

        HomePage pearlyHomePage = new HomePage();
        LoginPage pearlyLoginPage = new LoginPage();

        pearlyHomePage.signIn.click();
        pearlyLoginPage.username.sendKeys(ConfigReader.getProperty("username"));
        pearlyLoginPage.password.sendKeys(ConfigReader.getProperty("password"));
        pearlyLoginPage.rememberMe.click();
        pearlyLoginPage.loginButton.click();

    }

    public static void vendorSignIn(){
        HomePage pearlyHomePage = new HomePage();
        LoginPage pearlyLoginPage = new LoginPage();

        pearlyHomePage.signIn.click();
        pearlyLoginPage.username.sendKeys(ConfigReader.getProperty("vendor_username"));
        pearlyLoginPage.password.sendKeys(ConfigReader.getProperty("password"));
        pearlyLoginPage.rememberMe.click();
        pearlyLoginPage.loginButton.click();

    }

    public static void signOut(){
        HomePage pearlyHomePage = new HomePage();

        pearlyHomePage.signOut.click();
        pearlyHomePage.logOut.click();

    }


}
