package com.odoo.pages;

import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    @FindBy(css = "div[class='o_loading']")
    public WebElement loaderMask;

    @FindBy(xpath = "//li[.='#Inbox']")
    public WebElement pageSubTitle;

    @FindBy(css = "#oe_main_menu_navbar > a")
    public WebElement userName;

    @FindBy(linkText = "Log out")
    public WebElement logOutLink;

    @FindBy(linkText = "My Odoo.com account")
    public WebElement myUser;

    public BasePage() {
        //this method requires to provide webdriver object for @FindBy
        //and page class
        //this means this page class
        PageFactory.initElements(Driver.get(), this);
    }

    public boolean waitUntilLoaderMaskDisappear() {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 30);
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='loader-mask shown']")));
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Loader mask not found!");
            e.printStackTrace();
            return true; // no loader mask, all good, return true
        } catch (WebDriverException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void navigateTo(String moduleName){

        String moduleLocator= "//*[normalize-space()='"+ moduleName +"' and @class='oe_menu_text']";

        WebDriverWait wait = new WebDriverWait(Driver.get(),5);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(moduleLocator)));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(moduleLocator)));

        Driver.get().findElement(By.xpath(moduleLocator)).click();

    }

    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderMaskDisappear();
      //  BrowserUtils.wait(2);
        BrowserUtils.waitForVisibility(pageSubTitle,1);
        return pageSubTitle.getText();
    }

}