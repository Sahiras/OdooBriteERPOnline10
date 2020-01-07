package com.odoo.pages;

import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends BasePage {

    public ContactPage(){

        PageFactory.initElements(Driver.get(),this);

    }
    @FindBy(linkText = "Contacts")
    public WebElement Contact_Button;

    @FindBy(xpath = "//button[@accesskey=\"c\"]")
    public WebElement Create_button;


    @FindBy(css = "[name='name']")
    public WebElement Input_Name;

    @FindBy(css ="[name='street']")
    public WebElement Input_Street;

    @FindBy(css = "[name='street2']")
    public WebElement Input_Street2;

    @FindBy(css ="[name='city']")
    public WebElement Input_City;

    @FindBy(xpath ="(//*[@class='o_input_dropdown'])[2] )")
    public WebElement Dropdown_State;

    @FindBy(xpath = "//a[.='Aveiro']")
    public WebElement Select_State;

    @FindBy(css = "[name='zip']")
    public WebElement Input_Zip;


    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[3])")
    public WebElement Dropdown_Country;

    @FindBy(xpath = "//*[text()='Albania']")
    public WebElement Select_Country;

    @FindBy(css = "[name='vat']")
    public WebElement Input_Tin;

    @FindBy(xpath = "//*[@class='o_field_many2manytags o_input o_field_widget']")
    public WebElement Dropdown_Tag;

    @FindBy(xpath = "//a[.='dsa']")
    public WebElement Select_Tag;

     @FindBy(css = "[name='function']")
    public WebElement Input_Job_Position;

     @FindBy(css ="[name='phone']")
     public WebElement Input_Phone;

     @FindBy(css = "[@name='mobile']")
     public WebElement Input_Mobile_Phone;

     @FindBy(css ="[name='email']")
     public WebElement Input_Email;

     @FindBy(css = "[name='website']")
     public WebElement Input_Website;

     @FindBy(xpath = ("//*[@class= /'o_input ui-autocomplete-input'])[5])"))
     public WebElement Dropdown_Title;

     @FindBy(xpath = "//a[.='Doctor']")
     public WebElement Select_Title;

     @FindBy(xpath = "//*[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement Save_Button;



}
