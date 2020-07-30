package com.fasttrackit.steps.serenity;

import com.fasttrackit.Util.Constants;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;

    @Step
    public void openHomepage(){
        homePage.open();
    }

    @Step
    public void clickLoginLink(){
        homePage.clickOnLogin();
    }

    @Step
    public void setUserNameOrEmailField(String userNameOrEmail){
        myAccountPage.setUserNameOrEmailField(userNameOrEmail);
    }


    @Step
    public void setPasswordField(String pass) {
        myAccountPage.setLoginPassword(pass);
    }

    @Step
    public void clickOnLoginButton(){
        myAccountPage.clickOnLoginButton();
    }

    @Step
    public void verifyLoggedIn(){
        Assert.assertTrue(myAccountPage.verifyLogin());
    }

    @Step
    public void verifyLoginFailed(){
        Assert.assertTrue(myAccountPage.verifyLoginFailed());
    }

    @Step
    public void allLoginSteps() {
        openHomepage();
        clickLoginLink();
        setUserNameOrEmailField(Constants.USER_NAME);
        setPasswordField(Constants.USER_PASS);
        clickOnLoginButton();

    }

}
