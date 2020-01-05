package com.odoo.step_definitions;

import com.odoo.utilities.Driver;
import gherkin.ast.Scenario;
import org.junit.After;
import org.junit.Before;

public class Hook {

    @Before

    public void setUp(){

        Driver.get().manage().window().maximize();
    }

    @After

    public void teardown(Scenario scenario){

        Driver.close();
    }

}
