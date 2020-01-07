package com.odoo.pages;

import com.odoo.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Employee extends BasePage{
    @FindBy(xpath = "//div//button[contains(text(),'Create')]")
    public WebElement createEmployeeElement;

    @FindBy(xpath = "//li//a[contains(text(),'More')]")
    public WebElement moreElement;

    @FindBy(css = "a[href*='/web#menu_id=157&action=']")
    public WebElement emloyeedropdownElement;

    public void navigateToEmployeeModule(){
        BrowserUtils.waitForVisibility(moreElement,15);
        BrowserUtils.waitForClickability(moreElement,15);
        moreElement.click();
        BrowserUtils.waitForVisibility(emloyeedropdownElement,15);
        BrowserUtils.waitForClickability(emloyeedropdownElement,15);
        emloyeedropdownElement.click();
    }
    public void clickToCreateEmployee(){
        BrowserUtils.waitForVisibility(createEmployeeElement, 15);
        BrowserUtils.waitForClickability(createEmployeeElement,15);
        createEmployeeElement.click();
    }
}



//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class VehiclesPage extends BasePage{
//
//    @FindBy(css = "[title='Create Car']")
//    public WebElement createACarElement;
//
//    /**
//     * Use this method to click on "Create a Car" button
//     * Method already contains waits to handle synchronization issues
//     */
//public void clickToCreateACar(){
//    BrowserUtils.waitForVisibility(createACarElement, 15);
//    BrowserUtils.waitForClickablility(createACarElement, 15);
//    createACarElement.click();
//}
//}
//
