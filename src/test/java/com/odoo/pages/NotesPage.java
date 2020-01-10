package com.odoo.pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPage extends BasePage {

    public NotesPage(){
        PageFactory.initElements(Driver.get(),this);

    }


    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm o-kanban-button-new']")

    public WebElement clickCreateBtn;

    @FindBy(className = "note-editable panel-body")

    public WebElement textBoxAppears;









}
