package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by first on 04.06.2015.
 */
public class MenuPagePO {

    @FindBy(xpath = "//button[@value='#dinner']")
    private WebElement dinnerButton;


    public WebElement getDinnerButton() {
        return dinnerButton;
    }


    @FindBy(xpath = "//img[@alt='Японская']")
    private WebElement jappaniseFoodButton;


    public WebElement getJappaniseFoodButton() {
        return jappaniseFoodButton;
    }

    @FindBy(xpath = "//div[@id='cuisine']/div[6]/div[3]/label")
    private Actions onionCakes;


    public Actions getOnionCakes() {
        return onionCakes;
    }


}
