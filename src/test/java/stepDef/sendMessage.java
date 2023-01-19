package stepDef;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.groupChatPages;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class sendMessage extends hooks {
    groupChatPages groupChatPages = new groupChatPages();
    @When("user click menu group chat")
    public void user_click_menu_group_chat() {
        MobileElement menuGroupChat = (MobileElement) driver.findElement(groupChatPages.getBtn_menuGroupchat());
        menuGroupChat.click();
    }
    @And("user input message")
    public void user_input_message() {
        MobileElement fieldMessage = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(groupChatPages.getField_message()));
        fieldMessage.click();
        fieldMessage.sendKeys("Haii");
    }
    @And("user click icon send message button")
    public void user_click_icon_send_message_button() {
        MobileElement icon_send = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(groupChatPages.getBtn_sendMessage()));
        icon_send.isDisplayed();
        icon_send.click();
    }
    @Then("user verify message result")
    public void user_verify_message_result() {
        MobileElement message = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(groupChatPages.getDisplay_message()));
        message.isDisplayed();
    }

}
