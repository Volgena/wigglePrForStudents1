package com.stv.factory.factorypages;

import com.stv.framework.core.drivers.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BikesPage extends FactoryPage {
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @FindBy(xpath = "//a[text() = 'Bikes']")
    private WebElement BikesButton;

    @FindBy(xpath = "//a[contains(@data-ga-label,'Week 23')]//span[@class ='shopNowTitle']"
    private WebElement ShopNow;

    @FindBy(xpath = "//*[@id=\"wiggle\"]/div/div[1]/div[3]/div/div/div[1]/div[1]")
    private WebElement Bikes;

    @FindBy(xpath = "//*[@id=\"hr-search-guided-navigation\"]/div[2]/div/span[1]")
    private WebElement Filters;

    @FindBy(xpath = "//*[@id=\"hr-search-guided-navigation\"]/div[2]/div/span[2]")
    private WebElement LessFilters;

    public BikesPage(WebElement bikesButton) {
        BikesButton = bikesButton;
    }


    public static boolean[] IsOpened() {BikesPage.IsOpened();
        return new boolean[0];
    }

    public static boolean[] ShopNowDisplayed() {
        return new boolean[0];
    }


    public void clickBikes() {
        Bikes.click();
    }
    public boolean InscriptionDisplayed(){
        return BikesButton.isDisplayed();
    }
    public void ShopNow() {
        ShopNow.click();
    }

    public void clickOnQuickBuyButton() {
    }
}
