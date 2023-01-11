package objectRepo;

import org.openqa.selenium.By;

public class Addcard {
    By btn_menuboard = By.xpath("//android.view.View[@content-desc=\"Board\"]");
    By btn_addnewcard = By.xpath("(//android.widget.Button[@content-desc=\"Add new card\"])[1]");
    By field_cardname = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText");
    By icon_ceklist = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View");
    By btn_switch = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.Switch");
    By list_card = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]");

    public By getBtn_menuboard() {
        return btn_menuboard;
    }

    public By getBtn_addnewcard() {
        return btn_addnewcard;
    }

    public By getBtn_switch() {
        return btn_switch;
    }

    public By getField_cardname() {
        return field_cardname;
    }

    public By getIcon_ceklist() {
        return icon_ceklist;
    }

    public By getList_card() {
        return list_card;
    }
}
