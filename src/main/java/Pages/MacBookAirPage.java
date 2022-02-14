package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class MacBookAirPage {
    public SelenideElement
            // Buttons
            addToCart = $("#button-cart"),
            cartButton = $("#cart-total"),
            // Info
            price = $(byXpath("//h2[contains(text(), '$')]")),
            quantity = $("#input-quantity");
}
