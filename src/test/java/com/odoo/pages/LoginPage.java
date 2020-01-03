package com.odoo.pages;

import com.odoo.utilities.ConfigurationReader;


public class LoginPage {

    public void login(String username, String password) {
        login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }


}




}

