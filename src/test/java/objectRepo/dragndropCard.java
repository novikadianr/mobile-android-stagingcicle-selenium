package objectRepo;

import org.openqa.selenium.By;

public class dragndropCard {
    By success_message = By.xpath("//android.view.View[@content-desc=\"failed add new card2 card has been moved to done list\"]");
    By list_card2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]");
    By active_card = By.xpath("//android.widget.Button[@content-desc=\"failed add new card2\n" +
            "1\n" +
            "Show menu\"]");

    public By getSuccess_message() {
        return success_message;
    }

    public By getActive_card() {
        return active_card;
    }

    public By getList_card2() {
        return list_card2;
    }
}
