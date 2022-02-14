package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DeliveryMethodStepPage {
    public SelenideElement
            flatShipping = $(byXpath("//*[@name='shipping_method']/parent::label")),
            continueButton = $("#button-shipping-method");
}
