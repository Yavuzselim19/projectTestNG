package myapp.tests;

import myapp.pages.HomePage;
import myapp.pages.RegistrationPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.ReusableMethods;
import myapp.utilities.TestBase;
import org.testng.annotations.Test;

public class US_01_NegativeCustomerRegistration {
    @Test
    public void customerInvalidRegistration(){

        TestBase.goToURL();
        HomePage homePage = new HomePage();
        homePage.register.click();
        RegistrationPage registrationPage = new RegistrationPage();

        registrationPage.reg_username.sendKeys(ConfigReader.getProperty("reg_username"));
        registrationPage.reg_email.sendKeys(ConfigReader.getProperty("reg_email"));
        registrationPage.reg_password.sendKeys(ConfigReader.getProperty("reg_password"));
        registrationPage.register_policy.click();
        registrationPage.signUpButton.click();

        Driver.closeDriver();


    }
}
