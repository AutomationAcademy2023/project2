package Utils.Configs;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

import static com.codeborne.selenide.Configuration.*;

public class Config {
    public Config() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                                                            .screenshots(true)
                                                            .savePageSource(false)
                                                            .includeSelenideSteps(false));
        savePageSource = false;
        browserSize = "1024x768";
        timeout = 3000;
    }
}
