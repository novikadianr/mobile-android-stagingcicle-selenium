package objectRepo;

import org.openqa.selenium.By;

public class groupChatPages {
    By btn_menuGroupchat = By.xpath("//android.view.View[@content-desc=\"Group Chat\"]");
    By field_message = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    By btn_attachfile = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]");
    By btn_mention = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]");
    By btn_sendMessage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By display_message = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.ImageView");

    public By getField_message() {
        return field_message;
    }

    public By getBtn_mention() {
        return btn_mention;
    }

    public By getBtn_attachfile() {
        return btn_attachfile;
    }

    public By getBtn_menuGroupchat() {
        return btn_menuGroupchat;
    }

    public By getBtn_sendMessage() {
        return btn_sendMessage;
    }

    public By getDisplay_message() {
        return display_message;
    }
}
