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
    public void loginWithCorrectCredentialsTest(){
        loginSteps.openHomepage();
        loginSteps.clickLoginLink();
        loginSteps.setUserNameOrEmailField(Constants.USER_NAME);
        loginSteps.setPasswordField(Constants.USER_PASS);
        loginSteps.clickOnLoginButton();
        loginSteps.verifyLoggedInUserIdentity("kricsk3");
    }

    @Test
    public void loginWithIncorrectEmailTest(){
        loginSteps.openHomepage();
        loginSteps.clickLoginLink();
        loginSteps.setUserNameOrEmailField("kricsk@gmail.com");
        loginSteps.setPasswordField(Constants.USER_PASS);
        loginSteps.clickOnLoginButton();
        loginSteps.verifyLoginFailed();
    }

    @Test
    public void loginWithIncorrectPasswordTest(){
        loginSteps.openHomepage();
        loginSteps.clickLoginLink();
        loginSteps.setUserNameOrEmailField(Constants.USER_NAME);
        loginSteps.setPasswordField("admin12345678");
        loginSteps.clickOnLoginButton();
        loginSteps.verifyLoginFailed();
    }


    @Test
    public void loginAttemptWithoutEmailTest(){
        loginSteps.openHomepage();
        loginSteps.clickLoginLink();
        loginSteps.setUserNameOrEmailField("");
        loginSteps.setPasswordField(Constants.USER_PASS);
        loginSteps.clickOnLoginButton();
        loginSteps.verifyLoginFailed();
    }


    @Test
    public void loginAttemptWithoutPassTest(){
        loginSteps.openHomepage();
        loginSteps.clickLoginLink();
        loginSteps.setUserNameOrEmailField(Constants.USER_NAME);
        loginSteps.setPasswordField("");
        loginSteps.clickOnLoginButton();
        loginSteps.verifyLoginFailed();
    }

    @Test
    public void adminLoginTest(){
        loginSteps.openHomepage();
        loginSteps.clickLoginLink();
        loginSteps.setUserNameOrEmailField(Constants.ADMIN_USER_NAME);
        loginSteps.setPasswordField(Constants.ADMIN_USER_PASS);
        loginSteps.clickOnLoginButton();
        loginSteps.verifyLoggedInUserIdentity("admin");
    }



}
