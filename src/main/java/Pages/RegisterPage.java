package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    public SelenideElement
            // input
            firstName = $("#input-firstname"),
            lastName = $("#input-lastname"),
            email = $("#input-email"),
            telephone = $("#input-telephone"),
            password = $("#input-password"),
            confirmPass = $("#input-confirm"),
            // buttons
            agree = $(byName("agree")),
            submit = $(byValue("Continue"));
}
