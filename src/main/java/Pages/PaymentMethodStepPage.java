package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class PaymentMethodStepPage {
    public SelenideElement
            continueButton = $("#button-payment-method"),
            agreeButton = $(byCssSelector("[name='agree']"));
}
