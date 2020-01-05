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

    @FindBy(id = "//table/tbody/tr[1]/td[2]/input")

    public WebElement opportunityTitle;

    @FindBy(id = "o_field_input_1791")

    public WebElement dropdown;

    @FindBy(id = "o_field_input_4362")

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

            Driver.get().findElement(By.cssSelector("[title='Low']")).click();
            break;
        case("2"):
            Driver.get().findElement(By.cssSelector("[title='High']")).click();
            break;
        case("3"):
            Driver.get().findElement(By.cssSelector("[title='Very High']")).click();

        default:
            System.out.println("Invalid selection");
    }

}
}
