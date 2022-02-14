package Steps;

import Pages.HomePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.open;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Step
    public HomeSteps openHomePage(){
        open("http://tutorialsninja.com/demo/");
        return this;
    }

    @Step
    public HomeSteps clickMyAccount(){
        homePage.myAccount.click();
        return this;
    }

    @Step
    public HomeSteps moveToLaptopsAndNotebooks(){
        actions().moveToElement(homePage.laptopsAndNotebooks).perform();
        return this;
    }

    @Step
    public void clickShowAllLaptopsAndNotebooks(){
        homePage.showAllLaptopsAndNotebooks.click();
    }

    @Step
    public HomeSteps moveToDesktops(){
        actions().moveToElement(homePage.desktops).perform();
        return this;
    }

    @Step
    public void clickShowAllDesktops(){
        homePage.showAllDesktops.click();
    }

    @Step
    public void clickRegister(){
        homePage.register.click();
    }
}
