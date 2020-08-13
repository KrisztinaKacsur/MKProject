package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;

    @Step
    public void openHomepage() {
        homePage.open();
    }

    @Step
    public void clickOnLoginLink() {
        homePage.clickOnLogin();
    }

    @Step
    public void typeIntoEmailField() {
        myAccountPage.setEmailField();
    }

    @Step
    public void typeIntoPasswordField(String userName) {
        myAccountPage.setPasswordField(userName);
    }

    @Step
    public void clickOnRegisterButton() {
        myAccountPage.clickOnRegisterButton();
    }

    @Step
    public void verifyRegistration() {
        Assert.assertTrue(myAccountPage.verifyRegistered());
    }

    @Step
    public void verifyMyAccountPassOrEmailErrorMessage(String errorMsg) {
        Assert.assertTrue(myAccountPage.myAccountPassOrEmailErrorMessage(errorMsg));
    }

}
