package com.odoo.stepDefinitions;

import com.odoo.pages.CreateEmployee;
import com.odoo.pages.Employee;
import com.odoo.utilities.BrowserUtils;
import io.cucumber.java.en.*;

import java.util.List;
import java.util.Map;

public class CreateEmployeeStepDefinitions {
    CreateEmployee createEmployee = new CreateEmployee();
    Employee employee = new Employee();


    @And("user click on {string} button")
    public void user_click_on_button(String string) {
        employee.navigateToEmployeeModule();
        employee.waitUntilLoaderMaskDisappear();
        if(string.equals("Create")){
            employee.clickToCreateEmployee();
        }
    }

    @Then("user adds new employee information")
    public void user_adds_new_employee_information(List<Map<String, String>> dataTable) {
        createEmployee.waitUntilLoaderMaskDisappear();
        System.out.println(dataTable);
        BrowserUtils.wait(2);//for demo
        int row = 1;
        for (Map<String , String> map : dataTable) {
            BrowserUtils.wait(2);//for demo

            createEmployee.empNameElement.sendKeys(map.get("Name"));
            createEmployee.workLocationElement.sendKeys(map.get("Work Location"));
            createEmployee.workEmailElement.sendKeys(map.get("Work Email"));
            createEmployee.workMobileElement.sendKeys(map.get("Work Mobile"));
            createEmployee.workPhoneElement.sendKeys(map.get("Work Phone"));
            BrowserUtils.wait(2);//for demo

            createEmployee.otherInfoElement.sendKeys(map.get("other Info"));

            BrowserUtils.wait(2);//for demo
                if(row == dataTable.size()){
                     createEmployee.clickSave();
                } else {
                createEmployee.clickDiscard();
                }
            BrowserUtils.wait(2);//for demo
            row++;
        }
    }
}
//public class CreateCarStepDefinitions {
//
//    CreateCarPage createCarPage = new CreateCarPage();
//    VehiclesPage vehiclesPage = new VehiclesPage();
//
//    @Then("user click on {string} button")
//    public void user_click_on_button(String string) {
//        vehiclesPage.waitUntilLoaderMaskDisappear();
//        if (string.equals("Create Car")) {
//            vehiclesPage.clickToCreateACar();
//        }
//    }
//
//    //  Then user adds new car information:
//    // | License Plate | Driver      | Location        | Model Year | Color |
//    // |TestPlates     | Test Driver | Washington D.C. | 2020       | Black |
//    // |SomePlates     | Super Driver| Ohio            | 2023       | Blue  |
//    //dataTable.get(0).get("Model Year") = 2020
//    //get(0) - means get data from first row  (excluding column names or header )
//    //.get("Model Year") - get value of Model Year
//    @Then("user adds new car information:")
//    public void user_adds_new_car_information(List<Map<String, String>> dataTable) {
//        // as many rows of data you have, it will create cars
//        createCarPage.waitUntilLoaderMaskDisappear();
//        System.out.println(dataTable);
//        int row =1;
//
//        for (Map<String, String> map : dataTable) {
//            createCarPage.licensePlateElement.sendKeys(map.get("License Plate"));
//            createCarPage.driverElement.sendKeys(map.get("Driver"));
//            createCarPage.locationElement.sendKeys(map.get("Location"));
//            createCarPage.modelYearElement.sendKeys(map.get("Model Year"));
//            createCarPage.colorElement.sendKeys(map.get("Color"));
//            BrowserUtils.wait(2);//for demo
//            if (row == dataTable.size()) {
//                //if it is a last row - click save and close
//                createCarPage.clickSaveAndClose();
//            }else {
//                //if it's
//                createCarPage.clickSaveAndAddNew();
//            }
//            BrowserUtils.wait(2);//for demo
//            row++;
//        }
//    }
//
//}