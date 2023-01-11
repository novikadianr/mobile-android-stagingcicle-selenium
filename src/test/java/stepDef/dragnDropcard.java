package stepDef;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.dragndropCard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class dragnDropcard extends hooks {
    dragndropCard drop = new dragndropCard();
    @When("user drop card")
    public void user_drop_card() {
        AndroidElement source = (AndroidElement) driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"bug1\n" +
                "Show menu\"])"));
        AndroidElement target = (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
        new AndroidTouchAction(driver)
                .longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(source)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(ElementOption.element(target))
                .release()
                .perform();
    }
    @Then("user verify card moved result")
    public void user_verify_card_moved_result() {
        MobileElement elemen = (MobileElement) driver.findElement(drop.getList_card2());
        elemen.isDisplayed();
    }


}
