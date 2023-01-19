package objectRepo;

import org.openqa.selenium.By;

public class AddTeams {
    By list_comp = By.xpath("//android.view.View[@content-desc=\"AUtoVika\"]");
    By btn_iconplus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By menu_addnewteam = By.xpath("//android.view.View[@content-desc=\"Add new team\"]");
    By field_teamname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[1]");
    By field_teamdescription = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]");
    By btn_create = By.xpath("//android.widget.Button[@content-desc=\"Create\"]");
    By btn_x = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[1]");

    By error_message = By.xpath("//android.view.View[@content-desc=\"Name and description fields must be filled\"]");
    By list_team = By.xpath("//android.view.View[@content-desc=\"Team\"]/android.view.View/android.view.View");
    By result = By.xpath("//android.view.View[@content-desc=\"Team\"]/android.view.View/android.view.View/android.view.View");

    By form = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View");

    public By getForm() {
        return form;
    }

    public By getResult() {
        return result;
    }

    public By getBtn_x() {
        return btn_x;
    }

    public By getBtn_create() {
        return btn_create;
    }

    public By getError_message() {
        return error_message;
    }

    public By getList_team() {
        return list_team;
    }

    public By getBtn_iconplus() {
        return btn_iconplus;
    }

    public By getField_teamdescription() {
        return field_teamdescription;
    }

    public By getField_teamname() {
        return field_teamname;
    }

    public By getList_comp() {
        return list_comp;
    }

    public By getMenu_addnewteam() {
        return menu_addnewteam;
    }
}
