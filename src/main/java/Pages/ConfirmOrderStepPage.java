package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ConfirmOrderStepPage {
    public SelenideElement
            // Info
            subTotal = $(byXpath("//*[text()='Sub-Total:']/ancestor::td/following-sibling::td")),
            flatShippingConfirm = $(byXpath("//*[text()='Flat Shipping Rate:']/ancestor::td/following-sibling::td")),
            total = $(byXpath("//*[text()='Total:']/ancestor::td/following-sibling::td")),
            fail = $("#fail");
}
