package com.stv.bdd_fraimwork.steps;

import com.stv.factory.factorypages.AccountPage;
import com.stv.factory.factorypages.BikesPage;
import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.framework.core.drivers.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;
public class Steps {


    String email = "volha@mail.ru";
    String password = "123456789 ";


    public static WebDriver getDriver() {
        return Driver.getDriver();
    }

    public void waitPage() {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    private WebElement bikesButton;
    BikesPage roadBikesPage = new BikesPage(bikesButton);
    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    @Given("^opened mainPage$")
    public void setUp() {
        WebDriver driver = getDriver();
        driver.get(START_URL);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        mainFactoryPage.clickOnTrustButton();

    }

    @When("^click on the link  'Bikes' in the footer container$")
    public void bikesPage() {

        mainFactoryPage.goToBikesPage();

    }

    @Then("^bikes page is opened$")
    public void BikesPageIsOpened() {

        Assert.assertEquals(BikesPage.IsOpened(), true);

    }

    @When("^hovers over the picture with the category bike$")
    public void BikesPage() {
        BikesPage.ShopNowDisplayed();

    }

    @Then("^inscription 'show now' appears on the picture$")
    public void ShopNow() {

        Assert.assertEquals(BikesPage.ShopNowDisplayed(), true);

    }

    @When("^hovers over the picture with the category bike$")
    public void showNow() {
        Assert.assertEquals(BikesPage.ShopNowDisplayed(), true);
    }





    // homework steps

    @Given("login page")
    public void loginPage() {
        String LOGIN_URL;
        getDriver().get(START_URL);
    }

    @And("^go to login page$")
    public void goToLoginPage() {
        mainFactoryPage.clickOnAccountLink();
    }

    @When("user enters incorrect email {string}")
    public void enterEmail(String email) {
        loginPage.enterEmail(email);
    }

    @And("enters incorrect password {string}")
    public void enterPassword(String p) {
        loginPage.enterPassword(p);
    }

    @And("^clicks \"Sign in securely\"$")
    public void signIn() {
        loginPage.clickSignIn();
    }

    @Then("^error message appears$")
    public void isErrorMessageDisplayed() {
        Assert.assertEquals(loginPage.isErrorMessageDisplayed(), true);

    }


    @Then("account page is opened")
    public void accountPageIsOpened() {
        Assert.assertEquals(accountPage.isWelcomeDisplayed(), true);
    }

    @When("customer enters correct email and password")
    public void customerEntersCorrectEmailAndPassword() {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    @And("logout")
    public void logout() {
        accountPage.clickSignOutButton();
    }

    @Then("inscription {string} appears on the picture")
    public void inscriptionAppearsOnThePicture(String arg0) {
        
    }

    @And("user click on the category picture")
    public void userClickOnTheCategoryPicture() {
        
    }

    @Then("category bikesPage open")
    public void categoryBikesPageOpen() {
        
    }

    @And("press on the button {string}")
    public void pressOnTheButton(String arg0) {
        
    }

    @Then("open all filters")
    public void openAllFilters() {
        
    }

    @Then("filters hide")
    public void filtersHide() {
    }
}
