package myapp.tests;

import myapp.pages.PearlyHomePage;
import myapp.pages.PearlyLoginPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class US_02 {

    /*
    1.User should enter a registered username.
    2.User should enter a registered email address.
    3.User should enter a password.
    4.Click on the SIGN UP button to register.
   5."An account is already registered with your email address." should be visible.
     */

    // 1. Go to https://pearlymarket.com/
    @Test
    public void loginTest() {
        PearlyHomePage pearlyHomePage = new PearlyHomePage();
        PearlyLoginPage pearlyLoginPage = new PearlyLoginPage();

        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));


        //2. Click to the register button
        pearlyLoginPage.registerButton.click();
        //4. Send keys to username text box
        pearlyLoginPage.userNameEntry.sendKeys(ConfigReader.getProperty("userNameRegister"));
        //5. click on email textbox
        pearlyLoginPage.userEMailEntry.click();
        //5.send keys on email textbook
        pearlyLoginPage.userEMailEntry.sendKeys(ConfigReader.getProperty("emailRegister"));
        //6.send the keys on password
        pearlyLoginPage.passwordEntry.click();
        pearlyLoginPage.passwordEntry.sendKeys(ConfigReader.getProperty("passwordRegister"));
        //6.Accept the condition,click checkbox
        pearlyLoginPage.checkBox.click();
        //7.click the signup button

        pearlyLoginPage.signUpButton.click();

        assertTrue(pearlyLoginPage.submitStatusMessage.isDisplayed());

        System.out.println(pearlyLoginPage.submitStatusMessage.getText());


    }
    }
