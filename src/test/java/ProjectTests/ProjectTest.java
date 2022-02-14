package ProjectTests;

import Utils.Configs.Config;
import Utils.Annotations.MaxNumberOfRetries;
import Data.InsertDataBase;
import Steps.*;

import com.codeborne.selenide.testng.ScreenShooter;
import io.qameta.allure.*;
import org.testng.annotations.*;

@Listeners({ScreenShooter.class})
@Epic("ProjectTests")
@Feature("ProjectTest")
public class ProjectTest extends Config {
    InsertDataBase insertDB;
    HomeSteps homeSteps;
    RegisterSteps registerSteps;
    LaptopsAndNotebooksSteps lapsAndNotsSteps;
    DesktopsSteps desktopsSteps;
    MacBookAirSteps macBookAirSteps;
    BillingDetailsSteps billingDetails;
    DeliveryDetailsSteps deliveryDetails;
    DeliveryMethodSteps deliveryMethod;
    PaymentMethodSteps paymentMethod;
    ConfirmOrderSteps confirmOrder;

    public ProjectTest(){
        insertDB = new InsertDataBase();
        homeSteps = new HomeSteps();
        registerSteps = new RegisterSteps();
        lapsAndNotsSteps = new LaptopsAndNotebooksSteps();
        desktopsSteps = new DesktopsSteps();
        macBookAirSteps = new MacBookAirSteps();
        billingDetails = new BillingDetailsSteps();
        deliveryDetails = new DeliveryDetailsSteps();
        deliveryMethod = new DeliveryMethodSteps();
        paymentMethod = new PaymentMethodSteps();
        confirmOrder = new ConfirmOrderSteps();
    }

    @Story("Registration")
    @Description("Test Description: Inserting user details in DataBase and registering new user on the website")
    @Test
    public void registration(){
        insertDB.insertUser();
        homeSteps.openHomePage()
                .clickMyAccount()
                .clickRegister();
        registerSteps.setFirstName()
                .setLastName()
                .setEmail()
                .setPhone()
                .setPassword()
                .setConfirmPassword()
                .clickAgree()
                .clickContinue();
    }

    @Test(groups = {"Regression1"})
    @Story("Sorting")
    @Description("Test Description: Sorting items and checking if sort works correctly")
    public void sorting(){
        homeSteps.openHomePage()
                .moveToLaptopsAndNotebooks()
                .clickShowAllLaptopsAndNotebooks();
        lapsAndNotsSteps.selectSortByWithValue("Price (High > Low)")
                .validateSortingHighToLow();
    }

    @Test(dependsOnMethods={"registration"}, groups = {"Regression2"})
    @Story("addToCart")
    @Description("Test Description: Adding an item into cart anc checking if it is correctly added")
    public void addToCart(){
        homeSteps.openHomePage()
                .moveToDesktops()
                .clickShowAllDesktops();
        desktopsSteps.clickLaptopsAndNotebooks();
        lapsAndNotsSteps.moveToMacBookAirAndValidateTitle()
                .clickMacBookAir();
        macBookAirSteps.clickAddToCart()
                .validateAddition();
    }

    @Test(dependsOnMethods={"addToCart"}, groups = {"Regression2"})
    @MaxNumberOfRetries(3)
    @Story("Order")
    @Description("Test Description: Ordering an item through checkout and filling shipping information")
    public void order(){
        macBookAirSteps.failTestThreeTimes()
                .clickCart()
                .clickCheckout();
        billingDetails.setFirstName()
                .setLastName()
                .setAddress()
                .setCity()
                .setCountry()
                .setState()
                .clickContinue();
        deliveryDetails.clickContinue();
        deliveryMethod.clickContinue();
        paymentMethod.clickAgreePaymentMethod()
                .clickContinue();
        confirmOrder.validateFlatShipping()
                .validateSubTotal()
                .validateTotal()
                .failForScreenshot();
    }
}
