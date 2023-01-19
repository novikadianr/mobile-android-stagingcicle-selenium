package stepDef;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.AddCompany;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class addCompany extends  hooks{
    AddCompany adcom = new AddCompany();

    @When("user click createnewcompany button")
    public void user_click_addcompany_button() {
        MobileElement btn_createnewcomp = (MobileElement) driver.findElement(adcom.getBtn_createnewcompany());
        btn_createnewcomp.click();
    }
    @And("user input company name")
    public void user_input_company_name() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(adcom.getDisplay_form()));
        MobileElement field_name = (MobileElement) driver.findElement(adcom.getField_compname());
        field_name.click();
        field_name.sendKeys("Vika Baru");
    }
    @And("user input company desc")
    public void user_input_company_desc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(adcom.getDisplay_form()));
        MobileElement field_desc = (MobileElement) driver.findElement(adcom.getField_compdesc());
        field_desc.click();
        field_desc.sendKeys("testing Android Staging Cicle");
    }
    @And("user click create button")
    public void user_click_create_button() {
        MobileElement btn_create = (MobileElement) driver.findElement(adcom.getBtn_create());
        btn_create.click();
    }
    @Then("user verify createnewcompany result")
    public void user_verify_addcompany_result() {
        MobileElement success_message = (MobileElement) driver.findElement(adcom.getSuccess_message());
        if (success_message.isDisplayed()){
            after();
        }
        else {
            MobileElement error_message = (MobileElement) driver.findElement(adcom.getError_message());
            error_message.isDisplayed();

            MobileElement form = (MobileElement) driver.findElement(adcom.getDisplay_form());
            form.isDisplayed();
            after();
        }
    }

}
