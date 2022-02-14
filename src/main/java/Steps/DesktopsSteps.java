package Steps;

import Pages.DesktopsPage;
import io.qameta.allure.Step;

public class DesktopsSteps {
    DesktopsPage desktops = new DesktopsPage();

    @Step
    public void clickLaptopsAndNotebooks(){
        desktops.lapsAndNotes.click();
    }
}
