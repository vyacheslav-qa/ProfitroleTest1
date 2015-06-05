package com.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;*/

/**
 * Created by first on 19.05.2015.
 */
public class HomePagePO extends By {

    @FindBy(className = "search-query")
    private WebElement searhString;


    @Override
    public List<WebElement> findElements(SearchContext searchContext) {
        return (List<WebElement>) searchContext.findElement(this);
    }

    public WebElement getSearhString() {
        return searhString;
    }

    public void setSearhString(WebElement searhString) {
        this.searhString = searhString;
    }


    @FindBy(linkText="Вход")
    private WebElement loginString;


    public WebElement getLoginString() {
        return loginString;
    }

    public void setLoginString(WebElement searhString) {
        this.loginString = loginString;
    }


    @FindBy(linkText="Создать меню")
    private WebElement createMenuButton;

    public WebElement getCreateMenuButton() {
        return createMenuButton;
    }


    @FindBy(linkText="Меню на день")
    private WebElement menuForADayButton;

    public WebElement getMenuForADayButton() {
        return menuForADayButton;
    }

}
