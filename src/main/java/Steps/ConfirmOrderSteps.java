package Steps;

import Pages.CartPage;
import Pages.ConfirmOrderStepPage;
import Pages.DeliveryMethodStepPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static java.lang.Double.parseDouble;

public class ConfirmOrderSteps {
    ConfirmOrderStepPage confirmOrder = new ConfirmOrderStepPage();
    CartPage cart = new CartPage();
    DeliveryMethodStepPage deliveryMethod = new DeliveryMethodStepPage();
    
    @Step
    public ConfirmOrderSteps validateSubTotal() {
        String cartSubTotal = executeJavaScript("return arguments[0].innerText;",
                cart.subTotal);
        assert cartSubTotal != null;
        confirmOrder.subTotal.shouldHave(Condition.exactText(cartSubTotal));
        return this;
    }

    @Step
    public ConfirmOrderSteps validateFlatShipping(){
        String flatShipDelFull = executeJavaScript("return arguments[0].innerText;",
                deliveryMethod.flatShipping);
        assert flatShipDelFull != null;
        String flatShipDel = flatShipDelFull.substring(flatShipDelFull.indexOf("$"));
        confirmOrder.flatShippingConfirm.shouldHave(Condition.exactText(flatShipDel));
        return this;
    }

    @Step
    public ConfirmOrderSteps validateTotal(){
        double subTotal = parseDouble(confirmOrder.subTotal.getText()
                .substring(confirmOrder.subTotal.getText().indexOf("$")+1).replaceAll(",", ""));
        double shipping = parseDouble(confirmOrder.flatShippingConfirm.getText()
                .substring(confirmOrder.flatShippingConfirm.getText().indexOf("$")+1).replaceAll(",", ""));
        double total = parseDouble(confirmOrder.total.getText()
                .substring(confirmOrder.total.getText().indexOf("$")+1).replaceAll(",", ""));
        Assert.assertEquals(total, subTotal + shipping);
        return this;
    }

    @Step
    public void failForScreenshot(){
        // allure does not attach screenshots taken with fail() method, for some reason
        confirmOrder.fail.click();
    }
}
