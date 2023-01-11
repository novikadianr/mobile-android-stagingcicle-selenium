package objectRepo;

import org.openqa.selenium.By;

public class AddCompany {
    By btn_createnewcompany = By.xpath("//android.widget.Button[@content-desc=\"Create New Company\"]");
    By field_compname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[1]");
    By field_compdesc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]");
    By btn_create = By.xpath("//android.widget.Button[@content-desc=\"Create\"]");
    By btn_x = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[1]");
    By success_message = By.xpath("//android.view.View[@content-desc=\"Successfully create company user\"]");
    By error_message = By.xpath("//android.view.View[@content-desc=\"Name and description fields must be filled\"]");
    By display_form = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View");
    By list_company = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View");

    By result_success = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]");

    public By getResult_success() {
        return result_success;
    }

    public By getList_company() {
        return list_company;
    }

    public By getBtn_create() {
        return btn_create;
    }

    public By getBtn_x() {
        return btn_x;
    }

    public By getBtn_createnewcompany() {
        return btn_createnewcompany;
    }

    public By getDisplay_form() {
        return display_form;
    }

    public By getError_message() {
        return error_message;
    }

    public By getField_compdesc() {
        return field_compdesc;
    }

    public By getField_compname() {
        return field_compname;
    }

    public By getSuccess_message() {
        return success_message;
    }
}
