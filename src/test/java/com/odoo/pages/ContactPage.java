package com.odoo.pages;

import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends BasePage {

    private WebDriver driver;
/*
    @FindBy(linkText = "Contacts")
    public WebElement Contact_Button;

    @FindBy(css = "[class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement Create_button;


    @FindBy(name= "name")
    public WebElement Input_Name;

    @FindBy(name= "street")
    public WebElement Input_Street;


    @FindBy(name= "city")
    public WebElement Input_City;

   // @FindBy(xpath ="//div[@name='state_id']//input")
   // public WebElement Dropdown_State;

    @FindBy(name="zip")
    public WebElement Input_Zip;

    @FindBy(xpath = "//div[@name='country_id']//input")
    public WebElement Country;


    @FindBy( name="vat")
    public WebElement Input_Tin;

    @FindBy( name="category_id")
    public WebElement Dropdown_Tag;


     @FindBy( name="function")
    public WebElement Input_Job_Position;

     @FindBy( name="phone")
     public WebElement Input_Phone;

     @FindBy( name="mobile")
     public WebElement Input_Mobile_Phone;

     @FindBy( name="email")
     public WebElement Input_Email;

     @FindBy( name="website")
     public WebElement Input_Website;

    // @FindBy(css = "[name='title']")
     //public WebElement Dropdown_Title;


     @FindBy(css = "[accesskey='s']")
    public WebElement Save_Button;

     @FindBy( name="name")
     public WebElement ContactName;

*/

    @FindBy(linkText = "Contacts")
    public WebElement Contacts;
    @FindBy(css = "button[accesskey='c']")
    public WebElement Create;
    @FindBy( name="name")
    public WebElement Name;
    @FindBy( name ="street")
    public WebElement Street;
    @FindBy( name ="city")
    public WebElement City;
    //@FindBy(xpath = "//div[@name='state_id']//input")
//public WebElement StateDrordown;
    @FindBy( name ="zip")
    public WebElement ZIP;
    @FindBy(xpath = "//div[@name='country_id']//input")
    public WebElement CountryDropdown;
    @FindBy( name ="vat")
    public WebElement TIN;
    //@FindBy(xpath = "")
//public WebElement TagsDropdown;
    @FindBy( name ="function")
    public WebElement JobPosition;
    @FindBy( name ="phone")
    public WebElement Phone;
    @FindBy( name ="mobile")
    public WebElement Mobile;
    @FindBy( name ="email")
    public WebElement Email;
    @FindBy( name="website")
    public WebElement Website;

    @FindBy(css = "[accesskey='s']")
    public WebElement Save_Button;

    @FindBy(xpath = "//a[.='Contacts']")
     public WebElement PageName;

    public ContactPage(){

        PageFactory.initElements(Driver.get(),this);

    }

}
