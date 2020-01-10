package com.odoo.pages;

import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PointOfSalePage extends BasePage {
    private WebDriver driver;
    //Point Of Sale button which is under the Configuration module
    @FindBy(xpath = "(//span[contains(text(),'Point')])[2]")
    public WebElement PointOfSaleButton;

    //Pos ==> Point Of Sale
    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement CreatePosButton;

    @FindBy(css = "[accesskey='s']")
    public WebElement SavePosButton;

    @FindBy(xpath = "//button[contains(text(),'Import')]")
    public WebElement ImportPosButton;

    @FindBy(css = "[name='name']")
    public WebElement NameOfPos;

    //Operation Type dropdown
    @FindBy(id = "o_field_input_271")
    public WebElement OperationType;

    //After creating a new page, ' not used ' will be shown, so i choose this way
    @FindBy(xpath = "//li[contains(text(),'not used')]")
    public WebElement VerifyingThePageButton;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement SavingButton;

    public PointOfSalePage(){

        PageFactory.initElements(Driver.get(),this);

    }

    public void SelectOperationType(){
        BrowserUtils.wait(2);
        Select select=new Select(driver.findElement(By.id("o_field_input_271")));
        BrowserUtils.wait(2);
        select.selectByVisibleText("YourCompany: SunnySun");
        BrowserUtils.wait(2);
    }
    public void CreateAPosMethod(String BusinessName){

        WebDriverWait wait = new WebDriverWait(Driver.get(),5);
        PointOfSaleButton.click();

        wait.until(ExpectedConditions.visibilityOf(CreatePosButton));
        wait.until(ExpectedConditions.elementToBeClickable(CreatePosButton));

        CreatePosButton.click();

        wait.until(ExpectedConditions.visibilityOf(NameOfPos));
        wait.until(ExpectedConditions.elementToBeClickable(NameOfPos));

        NameOfPos.sendKeys(BusinessName);

        Select select=new Select(driver.findElement(By.id("o_field_input_1194")));
        select.selectByVisibleText("YourCompany: Return Operations");

    }

}
