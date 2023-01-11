package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.Logout;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class logout extends hooks{
    Logout btn_logout = new Logout();
    @When("user click menu")
    public void user_click_menu() {
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Menu\n" +
                "Tab 4 of 4\"]")).click();
    }
    @And("user click logout button")
    public void user_click_logout_button() {
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Logout\n" +
                "v2.0.32+2052\"]"))));
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Logout\n" +
                "v2.0.32+2052\"]")).isDisplayed();
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Logout\n" +
                "v2.0.32+2052\"]")).click();

    }
    @Then("user verify logout result")
    public void user_verify_logout_result() {
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Are you sure to logout ?\"]")).isDisplayed();
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Ok\"]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sick of miscoordination?\"]/android.widget.ImageView[3]"))));
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sick of miscoordination?\"]/android.widget.ImageView[3]")).isDisplayed();
    }
}
