package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BillingDetailsStepPage {
    public SelenideElement
            firstName = $("#input-payment-firstname"),
            lastName = $("#input-payment-lastname"),
            address = $("#input-payment-address-1"),
            city = $("#input-payment-city"),
            newAddress = $(byXpath("//div[@id='payment-existing']/following-sibling::div/label/input")),
            countryValues = $(byXpath("//*[@id='input-payment-country']")),
            continueButton = $("#button-payment-address"),
            stateValues = $(byXpath("//*[@id='input-payment-zone']"));
}
