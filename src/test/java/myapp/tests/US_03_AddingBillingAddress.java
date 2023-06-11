package myapp.tests;

import myapp.pages.*;
import myapp.utilities.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_03_AddingBillingAddress {

    @Test
    public void addingBillingAddress(){

        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));

        LoginPage loginPage = new LoginPage();
        BillingDetailsPage billingDetailsPage = new BillingDetailsPage();
        BillingAddressPage billingAddressLocaters = new BillingAddressPage();
        MyAccountPage myAccountPage = new MyAccountPage();
        RegistrationPage registrationPage = new RegistrationPage();



        billingAddressLocaters.SignInLink.click();
        billingAddressLocaters.billing_username.sendKeys(ConfigReader.getProperty("billing_username"));
        billingAddressLocaters.billing_password.sendKeys(ConfigReader.getProperty("billing_password"));
        billingAddressLocaters.signInButton.click();


        JSUtils.scrollAllTheWayDownJS();
        WaitUtils.waitFor(3);
        billingAddressLocaters.myAccount.click();
        WaitUtils.waitFor(3);

        myAccountPage.addresses.click();
        JSUtils.clickWithTimeoutByJS(billingAddressLocaters.billingAddressADD);

        billingAddressLocaters.billingFirstName.sendKeys(ConfigReader.getProperty("billingFirstName"));
        billingAddressLocaters.billingLastName.sendKeys(ConfigReader.getProperty("billingLastName"));
        billingAddressLocaters.billingCompany.sendKeys(ConfigReader.getProperty("billingCompany"));
        ReusableMethods.selectByValue(billingAddressLocaters.billingCountryDropDown, "US");
        ReusableMethods.selectByVisibleText(billingAddressLocaters.billingStateDropDown, "Texas");

        billingAddressLocaters.billingAddress1.sendKeys(ConfigReader.getProperty("billingAddress1"));
        billingAddressLocaters.billingAddress2.sendKeys(ConfigReader.getProperty("billingAddress2"));
        billingAddressLocaters.billingCity.sendKeys(ConfigReader.getProperty("billingCity"));

        billingAddressLocaters.billingPostcode.sendKeys(ConfigReader.getProperty("billingPostcode"));
        billingAddressLocaters.billingPhone.sendKeys(ConfigReader.getProperty("billingPhone"));


        Assert.assertTrue(billingAddressLocaters.billingEmailAddress.isDisplayed());

        JSUtils.clickWithTimeoutByJS(billingAddressLocaters.saveAddress);

        Driver.closeDriver();

    }
}