package Steps;

import Data.GetDataBase;
import Pages.RegisterPage;

public class RegisterSteps {
    RegisterPage registerPage = new RegisterPage();
    GetDataBase select = new GetDataBase();

    public RegisterSteps setFirstName() {
        registerPage.firstName.setValue(select.getFirstName());
        return this;
    }

    public RegisterSteps setLastName() {
        registerPage.lastName.setValue(select.getLastName());
        return this;
    }

    public RegisterSteps setEmail() {
        registerPage.email.setValue(select.getEmail());
        return this;
    }

    public RegisterSteps setPhone() {
        registerPage.telephone.setValue(select.getPhone());
        return this;
    }

    public RegisterSteps setPassword() {
        registerPage.password.setValue(select.getPassword());
        return this;
    }

    public RegisterSteps setConfirmPassword() {
        registerPage.confirmPass.setValue(select.getPassword());
        return this;
    }

    public RegisterSteps clickAgree() {
        registerPage.agree.click();
        return this;
    }

    public RegisterSteps fillRegistrationForm() {
        setFirstName();
        setLastName();
        setEmail();
        setPhone();
        setPassword();
        setConfirmPassword();
        return this;
    }

    public void clickContinue() {
        registerPage.submit.click();
    }
}
