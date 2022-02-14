package Steps;

import Pages.DeliveryDetailsStepPage;
import io.qameta.allure.Step;

public class DeliveryDetailsSteps {
    DeliveryDetailsStepPage deliveryDetails = new DeliveryDetailsStepPage();
    @Step
    public DeliveryDetailsSteps clickContinue(){
        deliveryDetails.continueButton.click();
        return this;
    }
}
