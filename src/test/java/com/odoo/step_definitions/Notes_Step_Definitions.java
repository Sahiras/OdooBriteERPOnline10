package com.odoo.step_definitions;

import com.odoo.pages.NotesPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.poi.util.SystemOutLogger;
//import org.graalvm.compiler.debug.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.odoo.utilities.BrowserUtils.waitForClickablility;

public class Notes_Step_Definitions {


    NotesPage notesPage = new NotesPage();


    @Then("user navigates to  {string} button")
    public void user_navigates_to_button(String string) {
        System.out.println("user navigates to Notes button");

        notesPage.navigateTo("Notes");
    }

    @Then("user click create button under Notes")
    public void user_click_create_button_under_Notes() throws InterruptedException {
        System.out.println("user verifies that create button clicked");

        BrowserUtils.wait(5);
        notesPage.clickCreateBtn.click();
    }

    @Then("user verifies that {string} is available")
    public void user_verifies_that_is_available(String string) {
        System.out.println("user verifies that text box appears");

        Assert.assertTrue((notesPage.textBoxAppears).isDisplayed());

    }

}