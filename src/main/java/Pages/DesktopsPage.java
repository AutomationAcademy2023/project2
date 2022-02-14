package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class DesktopsPage {
    public SelenideElement
            // Buttons
            lapsAndNotes = $(byXpath("//div[@class='list-group']/a[contains(text(),'Laptops & Notebooks')]"));
}
