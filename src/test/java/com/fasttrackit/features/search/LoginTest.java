package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.Util.Constants;
import com.fasttrackit.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Steps
    LoginSteps loginSteps;

    @Test
    public void loginWithCorrectCredentials(){
        loginSteps.openHomepage();
        loginSteps.clickLoginLink();
        loginSteps.setUserNameOrEmailField(Constants.USER_NAME);
        loginSteps.setPasswordField(Constants.USER_PASS);
        loginSteps.clickOnLoginButton();
        loginSteps.verifyLoggedIn();
    }

    @Test
    public void loginWithIncorrectEmail(){
        loginSteps.openHomepage();
        loginSteps.clickLoginLink();
        loginSteps.setUserNameOrEmailField("kricsk@gmail.com");
        loginSteps.setPasswordField(Constants.USER_PASS);
        loginSteps.clickOnLoginButton();
        loginSteps.verifyLoginFailed();
    }

    @Test
    public void loginWithIncorrectPassword(){
        loginSteps.openHomepage();
        loginSteps.clickLoginLink();
        loginSteps.setUserNameOrEmailField(Constants.USER_NAME);
        loginSteps.setPasswordField("admin12345678");
        loginSteps.clickOnLoginButton();
        loginSteps.verifyLoginFailed();
    }

//test

    @Test
    public void loginAttemptWithoutEmail(){
        loginSteps.openHomepage();
        loginSteps.clickLoginLink();
        loginSteps.setUserNameOrEmailField("");
        loginSteps.setPasswordField(Constants.USER_PASS);
        loginSteps.clickOnLoginButton();
        loginSteps.verifyLoginFailed();
    }


    @Test
    public void loginAttemptWithoutPass(){
        loginSteps.openHomepage();
        loginSteps.clickLoginLink();
        loginSteps.setUserNameOrEmailField(Constants.USER_NAME);
        loginSteps.setPasswordField("");
        loginSteps.clickOnLoginButton();
        loginSteps.verifyLoginFailed();
    }



}
