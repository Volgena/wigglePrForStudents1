package com.stv.factory.factorytests;

import com.stv.factory.factorypages.AccountPage;
import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MainFactoryTest extends BasicFactoryTest {
    @DataProvider(name = "SignIn")
    public static Object[][] SignIn() {
        return new Object[][]{{"volha@mail.ru", "123456789", true}};
    }

    @DataProvider(name = "forExistedEmail")
    public static Object[][] forExistedEmail() {
        return new Object[][]{{"volha@mail.ru", true}};
    }

    @DataProvider(name = "Incorrect")
    public static Object[][] IncorrectSignIn() {
        return new Object[][]{{"volha@mail", "123456789", true}};
    }

    AccountPage accountPage = new AccountPage();
    LoginPage loginPage = new LoginPage();

    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Test(description = "Assert the main page is loaded and account icon is visible")
    public void assertAccountIconIsDisplayed() {
        mainFactoryPage.clickOnTrustButton();
        boolean actualResult = mainFactoryPage.isAccountLinkDisplayed();
        Assert.assertEquals(actualResult, true, "Account link isn't visible");
    }

    @Test(description = "Assert the login page is loaded", dependsOnMethods = "assertAccountIconIsDisplayed")
    public void assertLoginPageOpened() {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        Assert.assertEquals(new LoginPage().isLoginContainerDisplayed(), true, "Login page isn't loaded properly");
    }
}
