package com.odoo.step_definitions;

import com.odoo.pages.BasePage;
import com.odoo.pages.PointOfSalePage;
import com.odoo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Point_Of_Sale_Step_Definitions {

    PointOfSalePage pointOfSalePage=new PointOfSalePage();
    BasePage basePage=new BasePage();

    @Then("user clicks Point of Sale module under the Configuration")
    public void user_clicks_Point_of_Sale_module_under_the_Configuration() {

        pointOfSalePage.navigateTo("Point of Sale");
    }

    @Then("user click Create button")
    public void user_click_Create_button() {
        pointOfSalePage.PointOfSaleButton.click();
        BrowserUtils.wait(5);
        pointOfSalePage.CreatePosButton.click();
    }

    @Then("user fills the Name of the Point of Sale with {string}")
    public void user_fills_the_Name_of_the_Point_of_Sale_with(String Restaurante) {
        BrowserUtils.wait(2);
        pointOfSalePage.NameOfPos.sendKeys(Restaurante);
    }
    @Then("user makes sure that Saving button is visible")
    public void user_makes_sure_that_Saving_button_is_visible() {
        BrowserUtils.wait(1);
        pointOfSalePage.SavingButton.isDisplayed();
        BrowserUtils.wait(1);
    }




}
