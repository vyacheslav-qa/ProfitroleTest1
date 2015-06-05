package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by first on 04.06.2015.
 */
public class LoginPagePO  {

    @FindBy(id = "j_username")
    private WebElement userString;


    public LoginPagePO() {
    }

    public WebElement getUserString() {
        return userString;
    }

    public void setUserString(WebElement UserString) {
        this.userString = userString;
    }

    @FindBy(id = "j_password")
    private WebElement userPassword;


    public WebElement getPasswordString() {
        return userPassword;
    }


    @FindBy(css = "button.btn")
    private WebElement enterButton;


    public WebElement getEnterButton() {
        return enterButton;
    }

    @FindBy(linkText="Выход")
    private WebElement logoutString;


    public WebElement getLogoutString() {
        return logoutString;
    }
}
