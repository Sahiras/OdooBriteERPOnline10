package com.odoo.step_definitions;

import com.odoo.pages.CRMPage;
import com.odoo.pages.ContactPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class ContactPage_Step_Definitions {

    WebDriverWait wait= new WebDriverWait(Driver.get(),5);
    ContactPage contactPage = new ContactPage();



    @Then("user clicks {string} button")
    public void user_clicks_button(String string) {
        BrowserUtils.wait(5);
        contactPage.Contacts.click();
        BrowserUtils.wait(5);
        contactPage.Create.click();

    }

    @Then("user fills the form with the following data")
    public void user_fills_the_form_with_the_following_data(List<Map<String, String>> table) {
        contactPage.waitUntilLoaderMaskDisappear();
        BrowserUtils.wait(2);
        contactPage.Name.sendKeys(table.get(0).get("Name"));
        contactPage.Street.sendKeys(table.get(0).get("Street"));
        contactPage.City.sendKeys(table.get(0).get("City"));
        contactPage.ZIP.sendKeys(table.get(0).get("ZIP"));
        contactPage.CountryDropdown.sendKeys(table.get(0).get("Country"), Keys.ENTER);
        contactPage.TIN.sendKeys(table.get(0).get("TIN"));
        contactPage.JobPosition.sendKeys(table.get(0).get("Job Position"));
        contactPage.Phone.sendKeys(table.get(0).get("Phone"));
        contactPage.Mobile.sendKeys(table.get(0).get("Mobile"));
        contactPage.Email.sendKeys(table.get(0).get("Email"));
        contactPage.Website.sendKeys(table.get(0).get("Website"));

    }

    @Then("user clicks on {string} button")
    public void user_clicks_on_button(String string) {
    contactPage.Save_Button.click();
    }

    @Then("user verify the added name {string} is displayed at Contacts Page")
    public void user_verify_the_added_name_is_displayed_at_Contacts_Page(String string) {
        contactPage.waitUntilLoaderMaskDisappear();
        String actualPageName = contactPage.PageName.getText();
        contactPage.waitUntilLoaderMaskDisappear();
        String expectedPageName ="Contacts";

        Assert.assertEquals(expectedPageName,actualPageName);

    }
}