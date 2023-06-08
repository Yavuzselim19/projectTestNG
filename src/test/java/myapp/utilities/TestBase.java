package myapp.utilities;

import myapp.pages.*;
import org.openqa.selenium.Keys;

public class TestBase {
    static HomePage homePage = new HomePage();
    static LoginPage loginPage = new LoginPage();
    static MyAccountPage myAccountPage = new MyAccountPage();
    static StoreManagerPage storeManagerPage = new StoreManagerPage();
    static CouponPage couponPage = new CouponPage();

    public static void goToURL(){
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));
    }
    public static void userSignIn(){

        homePage.signIn.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.rememberMe.click();
        loginPage.loginButton.click();

    }

    public static void vendorSignIn(){

        homePage.signIn.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("vendor_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.rememberMe.click();
        loginPage.loginButton.click();

    }

    public static void vendorCouponGenerator(String addCouponCode){
        goToURL();
        vendorSignIn();
        JSUtils.clickWithTimeoutByJS(homePage.myAccount);
        JSUtils.clickWithTimeoutByJS(myAccountPage.storeManager);
        JSUtils.clickWithTimeoutByJS(storeManagerPage.coupons);
        JSUtils.clickWithTimeoutByJS(couponPage.addNew);
        couponPage.codeInput.sendKeys(addCouponCode);
        couponPage.descriptionTextArea.sendKeys("Enjoy the coupon");
        ReusableMethods.selectByVisibleText(couponPage.discountType, "Percentage discount");
        couponPage.couponAmount.sendKeys("100");
        couponPage.couponExpiryDate.sendKeys("2023-12-12" + Keys.ENTER);
        JSUtils.clickWithTimeoutByJS(couponPage.allowFreeShipping);
        JSUtils.clickWithTimeoutByJS(couponPage.showOnStore);
        JSUtils.clickWithTimeoutByJS(couponPage.couponManageLimit);
        JSUtils.clickWithTimeoutByJS(couponPage.submitButton);

    }

    public static void signOut(){

        homePage.signOut.click();
        homePage.logOut.click();

    }


}
