package com.odoo.pages;

import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public void navigateTo(String moduleName){

        String moduleLocator= "//*[normalize-space()='"+ moduleName +"' and @class='oe_menu_text']";

        WebDriverWait wait = new WebDriverWait(Driver.get(),5);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(moduleLocator)));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(moduleLocator)));

        Driver.get().findElement(By.xpath(moduleLocator)).click();

    }
}
