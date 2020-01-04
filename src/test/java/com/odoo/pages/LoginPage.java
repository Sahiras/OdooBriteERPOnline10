package com.odoo.pages;

import com.odoo.utilities.ConfigurationReader;
import org.openqa.selenium.support.PageFactory;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;


public class LoginPage extends BasePage {
    public LoginPage(){

        PageFactory.initElements(Driver.get(),this);

    public void login(String username, String password) {
        login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }


}




}

