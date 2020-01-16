package com.odoo.pages;

import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRMPage extends BasePage {

    public CRMPage(){

        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(css = "[class='btn btn-primary btn-sm o-kanban-button-new']")

    public WebElement createButton;

    @FindBy(css = "[class='btn btn-sm btn-default o_button_import']")

    public WebElement importButton;

    @FindBy(xpath = "//table/tbody/tr[1]/td[2]/input")

    public WebElement opportunityTitle;

    @FindBy(xpath = "//table/tbody/tr[2]/td[2]/div/div/input")

    public WebElement dropdown;

    @FindBy(xpath = "/html/body/ul[1]/li[9]/a")
    public WebElement createAndEdit;

    @FindBy(xpath = "/html/body/ul[1]/li[8]/a")
    public WebElement searchNMore;

    @FindBy(xpath = "//table/tbody/tr[10]/td")
    public WebElement selectAPerson;

    @FindBy(xpath = "//span[text()='Create']")
    public WebElement create;

    @FindBy(xpath = "//table/tbody/tr[3]/td[2]/div/input")
    public WebElement expectedRevenue;

    @FindBy(css = "[name='close_dialog']")

    public  WebElement closeDialog;


    public String verification(String title){
        String verification ="//*[text()='"+ title +"']" ;

        WebElement element = Driver.get().findElement(By.xpath(verification));

        String verify = element.getText();
        return verify;
    }

public void setPriority(String priorityLevel){

    switch (priorityLevel){

        case("1"):

            Driver.get().findElement(By.xpath("//table/tbody/tr[4]/td[2]/div/a[1]")).click();
            break;
        case("2"):
            Driver.get().findElement(By.xpath("//table/tbody/tr[4]/td[2]/div/a[2]")).click();
            break;
        case("3"):
            Driver.get().findElement(By.xpath("//table/tbody/tr[4]/td[2]/div/a[2]")).click();

        default:
            System.out.println("Invalid selection");
    }

}
}
