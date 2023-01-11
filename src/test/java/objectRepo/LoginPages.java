package objectRepo;

import org.openqa.selenium.By;

public class LoginPages {
    By btn_skip = By.xpath("//android.view.View[@content-desc=\"Skip\"]");
    By result_skip = By.xpath("//android.widget.CheckBox[@content-desc=\"Ready to be organised?\n" +
            "Don’t show me this introduction anymore\"]");
    By btn_signin = By.xpath("//android.widget.Button[@content-desc=\"Go to Sign In\"]");
    By btn_logingoogle = By.xpath("//android.widget.ImageView[@content-desc=\"Sign in with Google Account\"]");
    By btn_appleid = By.xpath("//android.widget.ImageView[@content-desc=\"Sign in with Apple\"]");
    By list_email = By.id("com.google.android.gms:id/container");
    By send_notif = By.id("com.android.permissioncontroller:id/grant_dialog");
    By btn_allow = By.id("com.android.permissioncontroller:id/permission_allow_button");
    By btn_notallow = By.id("com.android.permissioncontroller:id/permission_deny_button");
    By pict_logi = By.xpath("//android.widget.ImageView[@content-desc=\"logo\"]");

    public By getBtn_notallow() {
        return btn_notallow;
    }

    public By getBtn_allow() {
        return btn_allow;
    }

    public By getSend_notif() {
        return send_notif;
    }

    public By getPict_logi() {
        return pict_logi;
    }

    public By getBtn_appleid() {
        return btn_appleid;
    }

    public By getBtn_logingoogle() {
        return btn_logingoogle;
    }

    public By getBtn_signin() {
        return btn_signin;
    }

    public By getList_email() {
        return list_email;
    }

    public By getBtn_skip() {
        return btn_skip;
    }

    public By getResult_skip() {
        return result_skip;
    }
}
