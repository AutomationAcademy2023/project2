package Steps;

import Pages.PaymentMethodStepPage;
import io.qameta.allure.Step;

public class PaymentMethodSteps {
    PaymentMethodStepPage paymentMethod = new PaymentMethodStepPage();

    @Step
    public PaymentMethodSteps clickAgreePaymentMethod(){
        paymentMethod.agreeButton.click();
        return this;
    }

    @Step
    public PaymentMethodSteps clickContinue(){
        paymentMethod.continueButton.click();
        return this;
    }
}
