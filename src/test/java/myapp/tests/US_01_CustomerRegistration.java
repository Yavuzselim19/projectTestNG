package myapp.tests;

import myapp.pages.HomePage;
import myapp.pages.RegistrationPage;
import myapp.utilities.*;
import org.testng.annotations.Test;

public class US_01_CustomerRegistration {

    @Test
    public void customerRegistration(){

        TestBase.goToURL();
        HomePage homePage = new HomePage();
       JSUtils.clickWithTimeoutByJS(homePage.signIn);
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.reg_username.sendKeys(ConfigReader.getProperty("reg_username"));
        registrationPage.reg_email.sendKeys(ConfigReader.getProperty("reg_email"));
        registrationPage.reg_password.sendKeys(ConfigReader.getProperty("reg_password"));
        registrationPage.register_policy.click();
        registrationPage.signUpButton.click();

       // String expectedMessage = "Register successful, redirecting...";

       // ReusableMethods.verifyExpectedAndActualTextMatch(expectedMessage,registrationPage.submitStatusMessage);

        //JSUtils.clickWithTimeoutByJS(homePage.signOut);
      //  JSUtils.clickWithTimeoutByJS(homePage.logOut);

        homePage.signOut.click();
        homePage.logOut.click();
        Driver.closeDriver();

    }

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

       // String expectedMessage = "An account is already registered with that username. Please choose another.";

       // ReusableMethods.verifyExpectedAndActualTextMatch(expectedMessage,registrationPage.submitStatusMessage);

        Driver.closeDriver();


    }

}
