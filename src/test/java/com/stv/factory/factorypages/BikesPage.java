package com.stv.factory.factorypages;

import com.stv.framework.core.drivers.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BikesPage extends FactoryPage {
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @FindBy(xpath = "/html/body/div[8]/footer/div/div/div[6]/div/div[5]/div/a")
    private WebElement title;

    @FindBy(xpath = "//*[@id=\"wiggle\"]/div/div[1]/div[3]/div/div/div[1]/div[1]/a/div[1]/div/div")
    private WebElement ShopNow;

    @FindBy(xpath = "//*[@id=\"wiggle\"]/div/div[1]/div[3]/div/div/div[1]/div[1]")
    private WebElement Bikes;

    @FindBy(xpath = "//*[@id=\"hr-search-guided-navigation\"]/div[2]/div/span[1]")
    private WebElement Filters;

    @FindBy(xpath = "//*[@id=\"hr-search-guided-navigation\"]/div[2]/div/span[2]")
    private WebElement LessFilters;


    }

    public static void IsOpened() {BikesPage.IsOpened();
    }


    public void Bikes() {
        Bikes.click();
    }
    public boolean InscriptionDisplayed(){
        return title.isDisplayed();
    }
    public void ShopNow() {
        ShopNow.click();
    }
}
