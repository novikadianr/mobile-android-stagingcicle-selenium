package stepDef;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.Addlist;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class addnewlist extends  hooks{

    Addlist list = new Addlist();
    @When("user click menu board")
    public void user_click_menu_board() {
        wait.until(ExpectedConditions.elementToBeClickable(list.getMenu_board()));
        MobileElement menu_board = (MobileElement) driver.findElement(list.getMenu_board());
        menu_board.isDisplayed();
        menu_board.click();
    }
    @And("user click iconplus")
    public void user_click_iconplus() {
        wait.until(ExpectedConditions.elementToBeClickable(list.getBtn_iconplus()));
        MobileElement icon_plus = (MobileElement) driver.findElement(list.getBtn_iconplus());
        icon_plus.isDisplayed();
        icon_plus.click();
    }
    @And("user input list name")
    public void user_input_list_name() {
        wait.until(ExpectedConditions.elementToBeClickable(list.getField_addnewlist()));
        MobileElement fiels_namelist = (MobileElement) driver.findElement(list.getField_addnewlist());
        fiels_namelist.isDisplayed();
        fiels_namelist.sendKeys("done");
    }
    @And("user click submit button")
    public void user_click_submit_button() {
        wait.until(ExpectedConditions.elementToBeClickable(list.getBtn_submit()));
        MobileElement btn_submit = (MobileElement) driver.findElement(list.getBtn_submit());
        btn_submit.isDisplayed();
        btn_submit.click();
    }
    @Then("user verify addlist result")
    public void user_verify_addlist_result() {
        MobileElement result_addlist = (MobileElement) driver.findElement(list.getResult());
        if(result_addlist.isDisplayed()){
            after();
        }
        else {
            MobileElement failed_addlist = (MobileElement) driver.findElement(list.getForm());
            failed_addlist.isDisplayed();
            after();
        }
    }
}
