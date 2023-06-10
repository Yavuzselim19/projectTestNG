package myapp.tests;

import myapp.pages.US_02_LoginPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class US_02_RegisteredAccountSignUp {

    /*
    1.User should enter a registered username.
    2.User should enter a registered email address.
    3.User should enter a password.
    4.Click on the SIGN UP button to register.
    5."An account is already registered with your email address." should be visible.
     */

    @Test
    public void loginTest() {

        US_02_LoginPage loginPage = new US_02_LoginPage();
        //1. Go to "https://www.pearlymarket.com"
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));
        //2. Click to the register button
        loginPage.registerButton.click();
        //4. Send keys to username text box
        loginPage.userNameEntry.sendKeys(ConfigReader.getProperty("userNameRegister"));
        //5. click on email text-box
        loginPage.userEMailEntry.click();
        //5.send keys on email text-box
        loginPage.userEMailEntry.sendKeys(ConfigReader.getProperty("emailRegister"));
        //6.send the keys on password
        loginPage.passwordEntry.click();
        loginPage.passwordEntry.sendKeys(ConfigReader.getProperty("passwordRegister"));
        //6.Accept the condition,click checkbox
        loginPage.checkBox.click();
        //7.click the signup button
        loginPage.signUpButton.click();
        //8. "An account is already registered with your email address." should be visible.
        assertTrue(loginPage.submitStatusMessage.isDisplayed());
        System.out.println(loginPage.submitStatusMessage.getText());


    }
}