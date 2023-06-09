package myapp.tests;

import myapp.pages.HomePage;
import myapp.pages.RegistrationPage;
import myapp.utilities.*;
import org.testng.annotations.Test;

public class US_01_CustomerRegistration_1_Positive {

    @Test
    public void customerRegistration(){

        TestBase.goToURL();
        HomePage homePage = new HomePage();
        JSUtils.clickWithTimeoutByJS(homePage.register);
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.reg_username.sendKeys(ConfigReader.getProperty("reg_username"));
        registrationPage.reg_email.sendKeys(ConfigReader.getProperty("reg_email"));
        registrationPage.reg_password.sendKeys(ConfigReader.getProperty("reg_password"));
        registrationPage.register_policy.click();
        registrationPage.signUpButton.click();

        Driver.closeDriver();

    }

}