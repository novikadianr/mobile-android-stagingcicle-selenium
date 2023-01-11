package stepDef;

import io.appium.java_client.MobileElement;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.Addcard;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class addnewcard extends hooks {
    Addcard card = new Addcard();
    @When("user click addnewcard button")
    public void user_click_addnewcard_button() {
        MobileElement btn_addnewcard = (MobileElement) driver.findElement(card.getBtn_addnewcard());
        btn_addnewcard.isDisplayed();
        btn_addnewcard.click();
    }
    @And("user input name card")
    public void user_input_name_card() {
        MobileElement field_namecard = (MobileElement) driver.findElement(card.getField_cardname());
        field_namecard.isDisplayed();
        field_namecard.sendKeys("failed add new card2");
    }
    @And("user click ceklist button")
    public void user_click_ceklist_button() {
        wait.until(ExpectedConditions.elementToBeClickable(card.getIcon_ceklist()));
        MobileElement btn_ceklis = (MobileElement) driver.findElement(card.getIcon_ceklist());
        btn_ceklis.click();
    }
    @Then("user verify addcard result")
    public void user_verify_addcard_result() {
        wait.until(ExpectedConditions.elementToBeClickable(card.getList_card()));
        MobileElement btn_ceklis = (MobileElement) driver.findElement(card.getList_card());
        btn_ceklis.isDisplayed();
        after();
    }
}
