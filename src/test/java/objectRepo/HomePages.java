package objectRepo;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class HomePages {
    By image = By.xpath("//android.view.View[@content-desc=\"Sick of miscoordination?\"]/android.widget.ImageView[3]");
    By btn_skip = By.xpath("//android.view.View[@content-desc=\"Skip\"]");
    By btn_yess = By.xpath("//android.widget.Button[@content-desc=\"Yes!\"]");
    By swipe_left = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollIntoView(//android.view.View[@content-desc=\"Sick of miscoordination?\"]/android.widget.ImageView[3])");
    By swipe_right = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(textContains(\"Ready to be organised?\n" +
            "Don’t show me this introduction anymore\")");

    public By getBtn_skip() {
        return btn_skip;
    }

    public By getBtn_yess() {
        return btn_yess;
    }

    public By getImage() {
        return image;
    }

    public By getSwipe_left() {
        return swipe_left;
    }

    public By getSwipe_right() {
        return swipe_right;
    }
}
