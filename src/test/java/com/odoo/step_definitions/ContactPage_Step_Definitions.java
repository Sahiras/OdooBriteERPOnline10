package com.odoo.step_definitions;


import com.odoo.pages.ContactPage;
import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Then;

public class ContactPage_Step_Definitions {


    ContactPage contactPage = new ContactPage();



    @Then("user clicks {string} button")
    public void user_clicks_button(String string) {

       contactPage.Create_button.click();

     BrowserUtils.wait(3);
    }

    @Then("user enters {string}  into name box")
    public void user_enters_into_name_box(String string) {

        contactPage.Input_Name.sendKeys(string);
    }

    @Then("user enters {string} into street box")
    public void user_enters_into_street_box(String string)
    {
       contactPage.Input_Street.sendKeys(string);
    }

    @Then("user enters {string} into second street box")
    public void user_enters_into_second_street_box(String string) {

        contactPage.Input_Street2.sendKeys(string);
    }

    @Then("user enters {string} into city box")
    public void user_enters_into_city_box(String string) {
       contactPage.Input_City.sendKeys(string);
    }

    @Then("user clicks on {string} dropdown box")
    public void user_clicks_on_dropdown_box(String string) {
     contactPage.Dropdown_State.click();
    }

    @Then("user selects {string} from given option")
    public void user_selects_from_given_option(String string) {
     contactPage.Select_State.click();
    }

    @Then("user enters {string} into zip box")
    public void user_enters_into_zip_box(String string) {
     contactPage.Input_Zip.sendKeys();
    }

    @Then("user enters {string} into tin box")
    public void user_enters_into_tin_box(String string) {
     contactPage.Input_Zip.sendKeys(string);
    }

    @Then("user selects {string} from given options")
    public void user_selects_from_given_options(String string) {
     contactPage.Select_Country.click();
    }

    @Then("user enters {string} into job title box")
    public void user_enters_into_job_title_box(String string) {
     contactPage.Input_Job_Position.sendKeys(string);
    }

    @Then("user enters {string} into phone box")
    public void user_enters_into_phone_box(String string) {
    contactPage.Input_Phone.sendKeys(string);
    }

    @Then("user enters {string} into mobile phone box")
    public void user_enters_into_mobile_phone_box(String string) {
      contactPage.Input_Mobile_Phone.sendKeys(string);
    }

    @Then("user enters {string} into email box")
    public void user_enters_into_email_box(String string) {
    contactPage.Input_Email.sendKeys(string);
    }

    @Then("user enters {string} into website box")
    public void user_enters_into_website_box(String string) {
      contactPage.Input_Website.sendKeys(string);
    }

    @Then("user clicks on {string} button")
    public void user_clicks_on_button(String string) {
     contactPage.Save_Button.click();
    }







 }