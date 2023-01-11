package stepDef;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import objectRepo.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.MalformedURLException;

public class home extends hooks {
    AddTeams company = new AddTeams();
    Addlist team = new Addlist();
    Addcard card = new Addcard();
    @Given("user is on app home")
    public void user_is_on_app_home() throws MalformedURLException {
        before();
    }
    @And("user has created company")
    public void user_has_created_company() {
        MobileElement listcomp = (MobileElement) driver.findElement(company.getList_comp());
        listcomp.click();
    }
    @And("user already has team")
    public void user_already_has_team() {
        MobileElement listteam = (MobileElement) driver.findElement(team.getList_team());
        listteam.isDisplayed();
        listteam.click();
    }
    @And("user already has list on board")
    public void user_already_has_list_on_board() {
        wait.until(ExpectedConditions.elementToBeClickable(card.getBtn_menuboard()));
        MobileElement menu_board = (MobileElement) driver.findElement(card.getBtn_menuboard());
        menu_board.isDisplayed();
        menu_board.click();
    }
}
