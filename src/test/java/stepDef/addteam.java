package stepDef;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.AddTeams;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class addteam extends hooks {
    AddTeams addTeams = new AddTeams();
    @When("user click plus button")
    public void user_click_plus_button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addTeams.getBtn_iconplus()));
        MobileElement iconplus = (MobileElement) driver.findElement(addTeams.getBtn_iconplus());
        iconplus.isDisplayed();
        iconplus.click();
    }
    @And("user click menuaddnewteam button")
    public void user_click_menuaddnewteam_button() {
        wait.until(ExpectedConditions.elementToBeClickable(addTeams.getMenu_addnewteam()));
        MobileElement menuaddnewteam = (MobileElement) driver.findElement(addTeams.getMenu_addnewteam());
        menuaddnewteam.isDisplayed();
        menuaddnewteam.click();
    }
    @And("user input name team")
    public void user_input_name_team() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addTeams.getField_teamname()));
        MobileElement field_name = (MobileElement) driver.findElement(addTeams.getField_teamname());
        field_name.click();
        field_name.sendKeys("team Mobile");
    }
    @And("user input desc team")
    public void user_input_desc_team() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addTeams.getField_teamdescription()));
        MobileElement field_desc = (MobileElement) driver.findElement(addTeams.getField_teamdescription());
        field_desc.click();
        field_desc.sendKeys("team automation mobile staging cicle");
    }
    @And("user click create buton")
    public void user_click_create_buton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addTeams.getBtn_create()));
        MobileElement btn_createteam = (MobileElement) driver.findElement(addTeams.getBtn_create());
        btn_createteam.isDisplayed();
        btn_createteam.click();
    }
    @Then("user verify addnewteam result")
    public void user_verify_addnewteam_result() {

        MobileElement success_addteam = (MobileElement) driver.findElement(addTeams.getResult());
        if (success_addteam.isDisplayed()) {
            after();
        } else {
            MobileElement error_message = (MobileElement) driver.findElement(addTeams.getError_message());
            error_message.isDisplayed();

            MobileElement form = (MobileElement) driver.findElement(addTeams.getForm());
            form.isDisplayed();
            after();
        }
    }

}
