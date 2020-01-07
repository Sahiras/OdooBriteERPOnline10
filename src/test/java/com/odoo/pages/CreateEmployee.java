package com.odoo.pages;

import com.odoo.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEmployee extends BasePage {


    @FindBy(css = "input[class*='o_field_char o_field_widget o_input o_required_modifier'")
    public WebElement empNameElement;

    @FindBy(id = "o_field_input_1810")
    public WebElement partTimeElement;

    @FindBy(id = "o_field_input_1812")
    public WebElement workAddressElement;

    @FindBy(css = "input[name*='work_location'")
    public WebElement workLocationElement;

    @FindBy(css = "input[name*='work_email'")
    public WebElement workEmailElement;

    @FindBy(css = "input[name*='mobile_phone'")
    public WebElement workMobileElement;

    @FindBy(css = "input[name*='work_phone'")
    public WebElement workPhoneElement;

    @FindBy(id = "o_field_input_1817")
    public WebElement departmntElement;

    @FindBy(id = "o_field_input_1818")
    public WebElement jobPositionElement;

    @FindBy(id = "o_field_input_1819")
    public WebElement managerElement;

    @FindBy(id = "o_field_input_1820")
    public WebElement coachElement;

    @FindBy(id = "o_field_input_1822")
    public WebElement workingHoursElement;

    @FindBy(css = "[name*='notes'")
    public WebElement otherInfoElement;

    @FindBy(xpath = "//div//button[contains(text(),'Save')]")
    public WebElement saveButtonElement;

    @FindBy(xpath = "//div//button[contains(text(),'Discard')]")
    public WebElement discardButtonElement;

public void clickSave(){
    waitUntilLoaderMaskDisappear();
    BrowserUtils.waitForClickability(saveButtonElement,5);
    saveButtonElement.click();
}

public void clickDiscard(){
    waitUntilLoaderMaskDisappear();
    BrowserUtils.waitForClickability(discardButtonElement, 5);
    discardButtonElement.click();
}
}

//public class CreateCarPage extends BasePage {
//
//    @FindBy(css = "[id^='custom_entity_type_LicensePlate']")
//    public WebElement licensePlateElement;
//
//    @FindBy(name = "custom_entity_type[Driver]")
//    public WebElement driverElement;
//
//    @FindBy(name = "custom_entity_type[Location]")
//    public WebElement locationElement;
//
//    @FindBy(css = "[class='btn btn-success action-button']")
//    public WebElement saveAndCloseButtonElement;
//
//    @FindBy(xpath = "//li//button[contains(text(),'Save and New')]")
//    public WebElement saveAndNew;
//
//    @FindBy(xpath = "//li//button[contains(text(),'Save and Close')]")
//    public WebElement saveAndCloseButtonFromMenuElement;
//
//    @FindBy(css = "div[class='btn-group pull-right'] > a[data-toggle='dropdown']")
//    public WebElement saveAndCloseToggle;
//
//    @FindBy(css = "div[id*='FuelType']")
//    public WebElement fuelTypeElement;
//
//    //if this locator doesn't work, use [id^='uniform-custom_entity_type_Logo_file'] > span[class='action']
//    @FindBy(name = "custom_entity_type[Logo][file]")
//    public WebElement logoElement;
//
//    @FindBy(name = "custom_entity_type[ModelYear]")
//    public WebElement modelYearElement;
//
//    @FindBy(name = "custom_entity_type[Color]")
//    public WebElement colorElement;
//
//
//    /**
//     * This method stands for selecting tags
//     * Provide tag name to select
//     * If checkbox already selected, it will not do anything
//     *
//     * @param tagName - represents name of tag that has to be selected, like Junior, Senior or Purchased
//     * @return webelement of checkbox that was selected
//     * <p>
//     * CreateCarPage createCarPage = new CreateCarPage();
//     * <p>
//     * createCarPage.selectTags("Senior"); // Senior tag will be selected
//     */
////    public WebElement selectTags(String tagName) {
////        //locator for checkbox is based on label name
////        //label and checkbox are siblings
////        String locator = "//label[text()='" + tagName + "']/preceding-sibling::input[@type='checkbox']";
////        WebElement checkBox = Driver.get().findElement(By.xpath(locator));
////        BrowserUtils.waitForVisibility(checkBox, 15);
////        BrowserUtils.waitForClickablility(checkBox, 15);
////        if (!checkBox.isSelected()) {
////            checkBox.click();
////        }
////        return checkBox;
////    }
//
//    /**
//     * Select fuel type by visible text
//     *
//     * @param fuelType - Diesel, Electric, Hybrid
//     *                 <p>
//     *                 usage: CreateCarPage createCarPage = new CreateCarPage();
//     *                 <p>
//     *                 to select gasoline type
//     *                 createCarPage.selectFuelType("Diesel"); - if you want to select Diesel as fuel type
//     */
////    public void selectFuelType(String fuelType) {
////        String locator = "//div[@class='select2-result-label' and text()='" + fuelType + "']";
////        BrowserUtils.waitForClickablility(fuelTypeElement, 15);
////        fuelTypeElement.click();
////        WebElement fuelTypeSelectionElement = Driver.get().findElement(By.xpath(locator));
////        BrowserUtils.waitForClickablility(fuelTypeSelectionElement, 15);
////        fuelTypeSelectionElement.click();
////    }
//
//    /**
//     * This method will upload a file
//     * File from your computer!
//     *
//     * @param pathToTheFile that you want to upload
//     */
////    public void uploadLogo(String pathToTheFile) {
////        BrowserUtils.waitForVisibility(logoElement, 15);
////        logoElement.sendKeys(pathToTheFile);
////    }
//
//    public void clickSaveAndAddNew(){
//        waitUntilLoaderMaskDisappear();
//        BrowserUtils.clickWithWait(saveAndCloseToggle);
//        BrowserUtils.waitForVisibility(saveAndNew, 5);
//        BrowserUtils.clickWithWait(saveAndNew);
//    }
//
//    public void clickSaveAndClose(){
//        waitUntilLoaderMaskDisappear();
//        BrowserUtils.clickWithWait(saveAndCloseToggle);
//        BrowserUtils.waitForVisibility(saveAndCloseButtonFromMenuElement, 5);
//        BrowserUtils.clickWithWait(saveAndCloseButtonFromMenuElement);
//    }
//}