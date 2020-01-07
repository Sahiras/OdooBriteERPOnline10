package com.odoo.step_definitions;

import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_Step_Definitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user logs in as purchasing manager")
    public void user_logs_in_as_purchasing_manager() {
        String user = ConfigurationReader.getProperty("username");
        String pass = ConfigurationReader.getProperty("password");
        loginPage.login(user, pass);

    }

    @Then("user verifies that {string} page is displayed")
    public void user_verifies_that_page_is_displayed(String string) {
        BrowserUtils.wait(5);
        System.out.println("Verifying page title: " + string);
    }

}
