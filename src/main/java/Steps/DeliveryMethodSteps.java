package Steps;

import Pages.DeliveryMethodStepPage;
import io.qameta.allure.Step;

public class DeliveryMethodSteps {
    DeliveryMethodStepPage deliveryMethod = new DeliveryMethodStepPage();

    @Step
    public DeliveryMethodSteps clickContinue(){
        deliveryMethod.continueButton.click();
        return this;
    }
}
