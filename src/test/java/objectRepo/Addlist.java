package objectRepo;

import org.openqa.selenium.By;

public class Addlist {
    By list_team = By.xpath("//android.widget.Button[@content-desc=\"team Mobile\n" +
            "team automation mobile staging cicle\"]");
    By menu_board = By.xpath("//android.widget.ImageView[@content-desc=\"Board\"]");
    By btn_iconplus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By form = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View");
    By field_addnewlist = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
    By btn_submit = By.xpath("//android.widget.Button[@content-desc=\"Submit\"]");
    By result = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View");

    public By getList_team() {
        return list_team;
    }

    public By getForm() {
        return form;
    }

    public By getBtn_iconplus() {
        return btn_iconplus;
    }

    public By getBtn_submit() {
        return btn_submit;
    }

    public By getResult() {
        return result;
    }

    public By getField_addnewlist() {
        return field_addnewlist;
    }

    public By getMenu_board() {
        return menu_board;
    }
}
