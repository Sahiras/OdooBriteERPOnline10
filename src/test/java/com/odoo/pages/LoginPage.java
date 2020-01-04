package com.odoo.pages;

import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "login")

    public WebElement usernameInput;

    @FindBy(id = "password")

    public WebElement passwordInput;

    public void login(String userName, String password) {

        BrowserUtils.waitForVisibility(usernameInput,5);
        usernameInput.sendKeys(userName);
        //Keys.ENTER to replace login click
        passwordInput.sendKeys(password, Keys.ENTER);
    }


}






