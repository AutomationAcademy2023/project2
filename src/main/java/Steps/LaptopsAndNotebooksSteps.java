package Steps;

import Pages.LaptopsAndNotebooksPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.actions;
import static java.lang.Double.parseDouble;

public class LaptopsAndNotebooksSteps {
    LaptopsAndNotebooksPage lapAndNot = new LaptopsAndNotebooksPage();

    @Step("selectSortByWithValue: {0}")
    public LaptopsAndNotebooksSteps selectSortByWithValue(String text){
        lapAndNot.sortByValues.selectOptionContainingText(text);
        return this;
    }

    @Step
    public LaptopsAndNotebooksSteps validateSortingHighToLow(){
        ArrayList<Double> prices = new ArrayList<>();

        for(SelenideElement el : lapAndNot.prices)
            prices.add(parseDouble(el.getText().substring(1, el.getText().indexOf("\n"))
                                                                .replaceAll(",", "")));
        for(int i = 0; i < prices.size()-1; i++)
            Assert.assertTrue(prices.get(i) >= prices.get(i+1));

        return this;
    }

    @Step
    public LaptopsAndNotebooksSteps moveToMacBookAirAndValidateTitle(){
        actions().moveToElement(lapAndNot.macBookAir).perform();
        lapAndNot.macBookAir.shouldHave(Condition.attribute("title", "MacBook Air"));
        return this;
    }

    @Step
    public void clickMacBookAir(){
        lapAndNot.macBookAir.click();
    }
}
