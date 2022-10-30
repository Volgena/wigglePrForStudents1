package com.stv.factory.factorytests;

import com.stv.factory.factorypages.BikesPage;
import com.stv.framework.core.drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;
import static java.util.concurrent.TimeUnit.SECONDS;

public class BasicFactoryTest  {
    private WebElement ShopNow;

    public static WebDriver getDriver() {
        return Driver.getDriver();
    }

    @BeforeClass(description = "Start browser")
    public void setUp() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(5, SECONDS);


        class Waiters extends BikesPage {
            Waiters() {
                super(bikesButton);
            }

            public void waitForElementVisible(WebDriver driver, int timeout, WebElement ShopNow) {
                new WebDriverWait(driver, timeout).pollingEvery(2, TimeUnit.SECONDS)
                        .until(ExpectedConditions.visibilityOf(ShopNow));
            }
        }
    }
    @AfterClass
    public void afterClass() throws Exception {
        //getDriver().quit();
    }
}

