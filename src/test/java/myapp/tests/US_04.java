package myapp.tests;

import myapp.pages.PearlyHomePage;
import myapp.pages.PearlyLoginPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.WaitUtils;
import org.testng.annotations.Test;

public class US_04 {

    @Test
    public void loginTest() {
        PearlyHomePage pearlyHomePage = new PearlyHomePage();
        PearlyLoginPage pearlyLoginPage = new PearlyLoginPage();
        //Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));

        PearlySignIn.signIn();

        WaitUtils.waitFor(5);

        pearlyHomePage.myAccount.click();
        pearlyHomePage.addressesButton.click();
        pearlyHomePage.addButton.click();




    // go to my account

    //go to addresses

    //shipping address

    // click add

    //User should enter First name


    //user should add Last name,

    // Country/Region,

    // Street address,

    // Town / City, State and ZIP Code.

    //2.After clicking 'Save Address',

    // the Shipping Address should be added.













}}
