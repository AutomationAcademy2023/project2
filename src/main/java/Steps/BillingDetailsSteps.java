package Steps;

import Data.GetDataBase;
import Pages.BillingDetailsStepPage;
import io.qameta.allure.Step;

public class BillingDetailsSteps {
    BillingDetailsStepPage billingDetails = new BillingDetailsStepPage();
    GetDataBase getData = new GetDataBase();

    @Step
    public BillingDetailsSteps setFirstName(){
        billingDetails.firstName.setValue(getData.getFirstName());
        return this;
    }

    @Step
    public BillingDetailsSteps setLastName(){
        billingDetails.lastName.setValue(getData.getLastName());
        return this;
    }

    @Step
    public BillingDetailsSteps setAddress(){
        billingDetails.address.setValue(getData.getAddress());
        return this;
    }

    @Step
    public BillingDetailsSteps setCity(){
        billingDetails.city.setValue(getData.getCity());
        return this;
    }

    @Step
    public BillingDetailsSteps setCountry(){
        billingDetails.countryValues.selectOptionContainingText(getData.getCountry());
        return this;
    }

    @Step
    public BillingDetailsSteps setState(){
        billingDetails.stateValues.selectOptionContainingText(getData.getState());
        return this;
    }

    @Step
    public BillingDetailsSteps clickContinue(){
        billingDetails.continueButton.click();
        return this;
    }
}
