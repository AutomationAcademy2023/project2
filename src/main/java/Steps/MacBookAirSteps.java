package Steps;

import Pages.CartPage;
import Pages.MacBookAirPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static org.testng.Assert.fail;

public class MacBookAirSteps {
    MacBookAirPage macBookAir = new MacBookAirPage();
    CartPage cart = new CartPage();

    @Step
    public MacBookAirSteps clickAddToCart(){
        macBookAir.addToCart.click();
        return this;
    }

    int i = 0;
    @Step
    public MacBookAirSteps failTestThreeTimes(){
        i++;
        if(i < 4) fail();
        return this;
    }

    @Step
    public MacBookAirSteps validateAddition(){
        macBookAir.cartButton.shouldHave(exactText(" " + macBookAir.quantity.getValue() +
                " item(s) - " + macBookAir.price.getText()));
        return this;
    }

    @Step
    public MacBookAirSteps clickCart(){
        macBookAir.cartButton.click();
        return this;
    }

    @Step
    public MacBookAirSteps clickCheckout(){
        cart.checkout.click();
        return this;
    }
}
