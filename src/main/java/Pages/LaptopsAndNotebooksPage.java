package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LaptopsAndNotebooksPage {
    public SelenideElement
            // Buttons
            sortByValues = $(byXpath("//*[@id='input-sort']")),
            macBookAir = $(byTitle("MacBook Air"));

    public ElementsCollection
            // Info
            prices = $$(byClassName("price"));

}
