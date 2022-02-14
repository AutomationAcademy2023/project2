package Pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public SelenideElement
            // Buttons
            myAccount = $(byTitle("My Account")),
            register = $(byText("Register")),
            laptopsAndNotebooks = $(byText("Laptops & Notebooks")),
            showAllLaptopsAndNotebooks = $(byText("Show All Laptops & Notebooks")),
            desktops = $(byText("Desktops")),
            showAllDesktops = $(byText("Show All Desktops"));

}
