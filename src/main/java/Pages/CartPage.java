package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    public SelenideElement
            // Buttons
            checkout = $(byXpath("//*[text()=' Checkout']")),
            // Info
            subTotal = $(byXpath("//*[text()='Sub-Total']/ancestor::td/following-sibling::td"));
}
