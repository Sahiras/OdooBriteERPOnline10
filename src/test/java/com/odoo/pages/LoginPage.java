package com.odoo.pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//according to page object model design
//we have to create corresponded page class
//for each page of application
//login page = login page class
//every page class will store webelements and methods related to that page
public class LoginPage extends BasePage{

    @FindBy(linkText = "Sign in")
    public WebElement signinButton;

    @FindBy(id = "login") //this line will initialize web element
    public WebElement userNameInput;

    @FindBy(id = "password")//without findby, web element will be null
    public WebElement passwordInput;

    @FindBy(css = "[class='btn btn-primary']")
    public WebElement loginButton;


    @FindBy(css = "[class='alert alert-danger']")
    public WebElement warningMessage;

    public LoginPage() {
        //it's mandatory if you want to use @FindBy annotation
        //this means LoginPage class
        //Driver.get() return webdriver object
        PageFactory.initElements(Driver.get(), this);
    }

    /**
     * reusable login method
     * just call this method to login
     * provide username and password as parameters
     * @param userName
     * @param password
     */
    public void login(String userName, String password){
        signinButton.click();
        userNameInput.sendKeys(userName);
        //Keys.ENTER to replace login click
        passwordInput.sendKeys(password, Keys.ENTER);

//        BrowserUtils.waitForClickability(loginButton, 5);
//        loginButton.click();
    }
    public boolean verifyWarningMessageDisplay(){
        return warningMessage.isDisplayed();
    }
}