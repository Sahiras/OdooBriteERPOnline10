package com.odoo.stepDefinitions;
import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.*;



public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Login page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
}

    @Then("user logs in as purchasing manager")
    public void user_logs_in_as_purchasing_manager() {
        System.out.println("Login as a purschasing manager");
        String userName = ConfigurationReader.getProperty("user_name");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(userName, password);
    }

    @Then("user verifies that {string} page is displayed")
    public void user_verifies_that_page_is_displayed(String string) {
        BrowserUtils.wait(2);
        System.out.println("Verifying page title: " + string);
    }

}
