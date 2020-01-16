package com.odoo.step_definitions;

import com.odoo.pages.CRMPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CRM_Step_Definitions {

        CRMPage crmPage = new CRMPage();



    @Then("user navigates to {string} module")
    public void user_navigates_to_module(String string) {

        crmPage.navigateTo("CRM");
    }

    @Then("user click create button")
    public void user_click_create_button() {
        BrowserUtils.waitForClickablility(crmPage.createButton,5);
        crmPage.createButton.click();

    }

    @Then("user enters {string} into opportunity box")
    public void user_enters_into_opportunity_box(String string) {


        BrowserUtils.waitForVisibility(crmPage.opportunityTitle,5);
        crmPage.opportunityTitle.sendKeys(string);

    }



    @Then("user enters {string} into expected revenue box")
    public void user_enters_into_expected_revenue_box(String string) {

        crmPage.expectedRevenue.sendKeys(string);
    }

    @Then("user selects priority level as {string}")
    public void user_selects_priority_level_as(String string) {
       crmPage.setPriority(string);

       BrowserUtils.wait(2);
    }

    @Then("user selects create button")
    public void user_selects_create_button() {

        crmPage.closeDialog.click();

        BrowserUtils.wait(2);
    }

    @Then("user verifies that {string} is displayed")
    public void user_verifies_that_is_displayed(String string) {

        Assert.assertEquals(string,crmPage.verification(string));

    }

    //====================================


    @Then("user clicks dropdown menu")
    public void user_clicks_dropdown_menu() {
        crmPage.dropdown.click();
        BrowserUtils.wait(2);
    }

    @Then("user selects Search More")
    public void user_selects_Search_More() {
        BrowserUtils.waitForClickablility(crmPage.searchNMore,5);
        crmPage.searchNMore.click();


    }

    @Then("user selects a person and")
    public void user_selects_a_person_and() {

        BrowserUtils.waitForClickablility(crmPage.selectAPerson,5);
        crmPage.selectAPerson.click();

    }



}
